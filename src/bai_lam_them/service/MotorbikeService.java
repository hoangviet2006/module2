package bai_lam_them.service;

import bai_lam_them.model.Motorbike;
import bai_lam_them.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MotorbikeService implements IMotorbike {
    private static final String MOTOBIKE_FILE = "D:\\codegym\\module2\\src\\bai_lam_them\\data\\motorbike.csv";
    private static final boolean APPEND = true;
    private static final boolean NOT_APPEND = false;

    @Override
    public void addMotorbike(Motorbike motorbike) {
        List<String> stringList = new ArrayList<>();
        stringList.add(motorbike.getInforToFile());
        ReadAndWriteFile.writeFile(MOTOBIKE_FILE, stringList, APPEND);
    }

    @Override
    public List<Motorbike> getMotorbike() {
        List<Motorbike> stringList = new ArrayList<>();
        List<String> strings = ReadAndWriteFile.readFile(MOTOBIKE_FILE);
        String[] array;
        for (int i = 0; i < strings.size(); i++) {
            array = strings.get(i).split(",");
            Motorbike motorbike = new Motorbike(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]));
            stringList.add(motorbike);
        }
        return stringList;
    }

    @Override
    public boolean deleteMotorbike(int LicensePlate) {
        List<Motorbike> motorbikes = getMotorbike();
        boolean check = false;
        for (int i = 0; i < motorbikes.size(); i++) {
            if (motorbikes.get(i).getLicensePlate() == LicensePlate) {
                check = true;
                motorbikes.remove(i);
                break;
            }
        }
        if (check) {
            List<String> list = new ArrayList<>();
            for (Motorbike motorbike : motorbikes) {
                list.add(motorbike.getInforToFile());
            }
            ReadAndWriteFile.writeFile(MOTOBIKE_FILE, list, NOT_APPEND);
        }
        return check;

    }

    @Override
    public List<Motorbike> searchMotorbike(int LicensePlate) {
        List<Motorbike> motorbikes = getMotorbike();
        List<Motorbike> motorbikeList = new ArrayList<>();
        for (int i = 0; i < motorbikes.size(); i++) {
            if (motorbikes.get(i).getLicensePlate() == LicensePlate) {
                motorbikeList.add(motorbikes.get(i));
                break;
            }
        }
        return motorbikeList;
    }

    @Override
    public boolean edit(int LicensePlate, Motorbike motorbike) {
        List<Motorbike> motorbikes = getMotorbike();
        for (int i = 0; i < motorbikes.size(); i++) {
            if (motorbikes.get(i).getLicensePlate()==LicensePlate){
                motorbikes.set(i,motorbike);
                return true;
            }
        }
        List<String> list = new ArrayList<>();
        for (Motorbike motorbike1: motorbikes) {
            list.add(motorbike1.getInforToFile());
        }
        ReadAndWriteFile.writeFile(MOTOBIKE_FILE,list,NOT_APPEND);
        return false;
    }


}
