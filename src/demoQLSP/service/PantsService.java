package demoQLSP.service;

import demoQLSP.model.Pants;
import demoQLSP.model.Shirt;
import ss21_product.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class PantsService implements IPantsService{
    private final String SHIRT_FILE = "D:\\codegym\\module2\\src\\demoQLSP\\data\\product.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;
    @Override
    public List<Pants> getPants() {
        List<Pants> pantsList = new ArrayList<>();
        List<String> stringList= ReadAndWriteFile.readFile(SHIRT_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array=stringList.get(i).split(",");
            if (array[array.length-1].equals("Quần")){
                Pants pants = new Pants(Integer.parseInt(array[0]),array[1],Double.parseDouble(array[2]),array[3],Integer.parseInt(array[4]),array[5]);
                pantsList.add(pants);
            }
        }
        return pantsList;
    }

    @Override
    public void addPants(Pants pants) {
        List<Pants> pantsList = getPants();
        if (pantsList.size()==0){
            pants.setId(1);
        }else {
            pants.setId(pantsList.get(pantsList.size()-1).getId()+1);
        }
        List<String> stringList = new ArrayList<>();
        stringList.add(pants.getInfoToFile());
        ReadAndWriteFile.writeFile(SHIRT_FILE,stringList,APPEND);
    }

    @Override
    public boolean editPants(String name, Pants pants) {
        List<Pants> shirtList = getPants();
        List<String> stringList = new ArrayList<>();
        pants.setId(pants.getId());
        for (int i = 0; i < shirtList.size(); i++) {
            if (shirtList.get(i).getName().equals(name)){
                shirtList.set(i,pants);
            }
        }
        for (Pants shirt1: shirtList){
            stringList.add(shirt1.getInfoToFile());
        }
        ReadAndWriteFile.writeFile(SHIRT_FILE,stringList,NOT_APPEND);
        return true;
    }

    @Override
    public boolean deletePants(String name) {
        List<Pants> shirtList = getPants();
        boolean check =false;
        for (int i = 0; i < shirtList.size(); i++) {
            if (shirtList.get(i).getName().equals(name)){
                check=true;
                shirtList.remove(i);
                break;
            }
        }
        if (check){
            List<String> stringList = new ArrayList<>();
            for (Pants shirt: shirtList){
                stringList.add(shirt.getInfoToFile());
            }
            ReadAndWriteFile.writeFile(SHIRT_FILE,stringList,NOT_APPEND);
        }
        return check;
    }

    @Override
    public List<Pants> searchPants(String name) {
        List<Pants> shirtList = getPants();
        List<Pants> newShirt = new ArrayList<>();
        for (int i = 0; i < shirtList.size(); i++) {
            if (shirtList.get(i).getName().contains(name)){
                newShirt.add(shirtList.get(i));
                break;
            }
        }
        return newShirt;
    }
}
