package thi_module.service;

import demoQLSP.model.Pants;
import ss21_product.util.ReadAndWriteFile;
import thi_module.model.PaymentAccount;

import java.util.ArrayList;
import java.util.List;

public class PaymentAccountService implements IPaymentAccountService {
    private final String PAYMENT_FILE = "src/thi_module/data/bankaccount.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;
    @Override
    public void addPayment(PaymentAccount paymentAccount) {
        List<PaymentAccount> payment = getPayment();
        if (payment.size()==0){
            paymentAccount.setId(1);
        }else {
            paymentAccount.setId(payment.get(payment.size()-1).getId()+1);
        }
        List<String> stringList = new ArrayList<>();
        stringList.add(paymentAccount.getInfoToFile());
        ReadAndWriteFile.writeFile(PAYMENT_FILE,stringList,APPEND);
    }

    @Override
    public boolean deletePayment(String code) {
        List<PaymentAccount> paymentAccountList = getPayment();
        boolean check =false;
        for (int i = 0; i < paymentAccountList.size(); i++) {
            if (paymentAccountList.get(i).getName().equals(code)){
                check=true;
                paymentAccountList.remove(i);
                break;
            }
        }
        if (check){
            List<String> stringList = new ArrayList<>();
            for (PaymentAccount paymentAccount: paymentAccountList){
                stringList.add(paymentAccount.getInfoToFile());
            }
            ReadAndWriteFile.writeFile(PAYMENT_FILE,stringList,NOT_APPEND);
        }
        return check;
    }

    @Override
    public List<PaymentAccount> getPayment() {
        List<PaymentAccount> paymentAccountList = new ArrayList<>();
        List<String> stringList= ReadAndWriteFile.readFile(PAYMENT_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array=stringList.get(i).split(",");
            if (array.length==6){
                PaymentAccount paymentAccount = new PaymentAccount(Integer.parseInt(array[0]),array[1],array[2],array[3],Integer.parseInt(array[4]),Integer.parseInt(array[5]));
                paymentAccountList.add(paymentAccount);
            }
        }
        return paymentAccountList;
    }

    @Override
    public List<PaymentAccount> searchPayment(String name) {
        List<PaymentAccount> payment = getPayment();
        List<PaymentAccount> paymentAccountList = new ArrayList<>();
        for (int i = 0; i < payment.size(); i++) {
            if (payment.get(i).getName().contains(name)){
                paymentAccountList.add(payment.get(i));
                break;
            }
        }
        return paymentAccountList;
    }
}
