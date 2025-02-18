package thi_module.service;

import ss21_product.util.ReadAndWriteFile;
import thi_module.model.PaymentAccount;
import thi_module.model.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class SavingsAccountService implements ISavingsAccountService{
    private final String PAYMENT_FILE = "D:\\codegym\\module2\\src\\thi_module\\data\\bankaccount.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;
    @Override
    public void addSavings(SavingsAccount savingsAccount) {
        List<SavingsAccount> saving = getSaving();
        if (saving.size()==0){
           savingsAccount.setId(1);
        }else {
            savingsAccount.setId(saving.get(saving.size()-1).getId()+1);
        }
        List<String> stringList = new ArrayList<>();
        stringList.add(savingsAccount.getInfoToFile());
        ReadAndWriteFile.writeFile(PAYMENT_FILE,stringList,APPEND);
    }



    @Override
    public boolean deleteSaving(String name) {
        List<SavingsAccount> saving = getSaving();
        boolean check =false;
        for (int i = 0; i < saving.size(); i++) {
            if (saving.get(i).getName().equals(name)){
                check=true;
                saving.remove(i);
                break;
            }
        }
        if (check){
            List<String> stringList = new ArrayList<>();
            for (SavingsAccount savingsAccount: saving){
                stringList.add(savingsAccount.getInfoToFile());
            }
            ReadAndWriteFile.writeFile(PAYMENT_FILE,stringList,NOT_APPEND);
        }
        return check;
    }

    @Override
    public List<SavingsAccount> getSaving() {
        List<SavingsAccount> savingsAccounts = new ArrayList<>();
        List<String> stringList= ReadAndWriteFile.readFile(PAYMENT_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array=stringList.get(i).split(",");
            if (array.length==8){
                SavingsAccount savingsAccount = new SavingsAccount(Integer.parseInt(array[0]),array[1],array[2],array[3],Integer.parseInt(array[4]),array[5],Integer.parseInt(array[6]),array[7]);
                savingsAccounts.add(savingsAccount);
            }
        }
        return savingsAccounts;
    }

    @Override
    public List<SavingsAccount> searchSaving(String name) {
        List<SavingsAccount> saving = getSaving();
        List<SavingsAccount> savingsAccounts = new ArrayList<>();
        for (int i = 0; i < saving.size(); i++) {
            if (saving.get(i).getName().contains(name)){
                savingsAccounts.add(saving.get(i));
                break;
            }
        }
        return savingsAccounts;
    }
}
