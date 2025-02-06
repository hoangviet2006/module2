package bai_lam_them.service;

import bai_lam_them.model.Truck;
import bai_lam_them.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrunkService implements ITruck {

    private static final String TRUNK_FILE = "D:\\codegym\\module2\\src\\bai_lam_them\\data\\truck.csv";
    private static final boolean APPEND = true;
    private static final boolean NOT_APPEND = false;

    @Override
    public void addTrunk(Truck truck) {
        List<String> list = new ArrayList<>();
        list.add(truck.getInforToFile());
        ReadAndWriteFile.writeFile(TRUNK_FILE, list, APPEND);
    }

    @Override
    public List<Truck> getTrunk() {
        List<Truck> truckList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(TRUNK_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Truck truck = new Truck(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]));
            truckList.add(truck);
        }
        return truckList;
    }

    @Override
    public boolean deleteTrunk(int LicensePlate) {
        List<Truck> truckList = getTrunk();
        boolean check = false;
        for (int i = 0; i < truckList.size(); i++) {
            if (truckList.get(i).getLicensePlate() == LicensePlate) {
                check = true;
                truckList.remove(i);
                break;
            }
        }
        if (check) {
            List<String> stringList = new ArrayList<>();
            for (Truck string : truckList) {
                stringList.add(string.getInforToFile());
            }
            ReadAndWriteFile.writeFile(TRUNK_FILE, stringList, NOT_APPEND);
        }
        return check;
    }

    @Override
    public List<Truck> searchTrunk(int LicensePlate) {
        List<Truck> truckList = getTrunk();
        List<Truck> list = new ArrayList<>();
        for (int i = 0; i < truckList.size(); i++) {
            if (truckList.get(i).getLicensePlate() == LicensePlate) {
                list.add(truckList.get(i));
            }
        }
        return list;
    }

    @Override
    public boolean edit(int LicensePlate, Truck truck) {
        List<Truck> list = getTrunk();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLicensePlate()==LicensePlate){
                list.set(i,truck);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Truck truckList: list){
            stringList.add(truckList.getInforToFile());
        }
        ReadAndWriteFile.writeFile(TRUNK_FILE,stringList,NOT_APPEND);
        return true;
    }

}
