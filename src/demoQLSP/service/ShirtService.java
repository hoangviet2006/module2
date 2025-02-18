package demoQLSP.service;

import demoQLSP.model.Shirt;
import ss21_product.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class ShirtService implements IShirtService{
    private final String SHIRT_FILE = "D:\\codegym\\module2\\src\\demoQLSP\\data\\product.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;
    @Override
    public List<Shirt> getShirt() {
       List<Shirt> shirtList = new ArrayList<>();
       List<String> stringList= ReadAndWriteFile.readFile(SHIRT_FILE);
       String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array=stringList.get(i).split(",");
            if (array[array.length-1].equals("Áo")){
                Shirt shirt = new Shirt(Integer.parseInt(array[0]),array[1],Double.parseDouble(array[2]),array[3],Integer.parseInt(array[4]),array[5]);
                shirtList.add(shirt);
            }
        }
        return shirtList;
    }

    @Override
    public void addShirt(Shirt shirt) {
        List<Shirt> list = getShirt();
        if (list.size()==0){
            shirt.setId(1);
        }else {
            shirt.setId(list.get(list.size()-1).getId()+1);
        }
        List<String> stringList = new ArrayList<>();
        stringList.add(shirt.getInfoToFile());
        ReadAndWriteFile.writeFile(SHIRT_FILE,stringList,APPEND);
    }

    @Override
    public boolean editShirt(String name, Shirt shirt) {
       List<Shirt> shirtList = getShirt();
       List<String> stringList = new ArrayList<>();
       shirt.setId(shirt.getId());
        for (int i = 0; i < shirtList.size(); i++) {
            if (shirtList.get(i).getName().equals(name)){
                shirtList.set(i,shirt);
            }
        }
        for (Shirt shirt1: shirtList){
            stringList.add(shirt1.getInfoToFile());
        }
        ReadAndWriteFile.writeFile(SHIRT_FILE,stringList,NOT_APPEND);
        return true;
    }

    @Override
    public boolean deleteShirt(String name) {
       List<Shirt> shirtList = getShirt();
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
            for (Shirt shirt: shirtList){
                stringList.add(shirt.getInfoToFile());
            }
            ReadAndWriteFile.writeFile(SHIRT_FILE,stringList,NOT_APPEND);
        }
        return check;
    }

    @Override
    public List<Shirt> searchShirt(String name) {
        List<Shirt> shirtList = getShirt();
        List<Shirt> newShirt = new ArrayList<>();
        for (int i = 0; i < shirtList.size(); i++) {
            if (shirtList.get(i).getName().contains(name)){
                newShirt.add(shirtList.get(i));
                break;
            }
        }
        return newShirt;
    }
}
