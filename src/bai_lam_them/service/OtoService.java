package bai_lam_them.service;

import bai_lam_them.model.Oto;
import bai_lam_them.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OtoService implements IOto {
    private static final String OTO_FILE = "D:\\codegym\\module2\\src\\bai_lam_them\\data\\oto.csv";
    private static final boolean APPEND = true;
    private static final boolean NOT_APPEND = false;

    @Override
    public void addOto(Oto oto) {
        List<String> stringList = new ArrayList<>();
        stringList.add(oto.getInforToFile());
        ReadAndWriteFile.writeFile(OTO_FILE, stringList, APPEND);
    }

    @Override
    public List<Oto> getOto() {
        List<Oto> otos = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(OTO_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Oto oto = new Oto(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]), array[5]);
            otos.add(oto);
        }
        return otos;
    }

    @Override
    public boolean deleteOto(int LicensePlate) {
        List<Oto> otos = getOto();
        boolean check = false;
        for (int i = 0; i < otos.size(); i++) {
            if (otos.get(i).getLicensePlate() == LicensePlate) {
                check = true;
                otos.remove(i);
                break;
            }
        }
        if (check) {
            List<String> stringList = new ArrayList<>();
            for (Oto oto : otos) {
                stringList.add(oto.getInforToFile());
            }
            ReadAndWriteFile.writeFile(OTO_FILE, stringList, NOT_APPEND);
        }
        return check;
    }

    @Override
    public List<Oto> searchOto(int LicensePlate) {
        List<Oto> otos = new ArrayList<>();
        List<Oto> list = getOto();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLicensePlate() == LicensePlate) {
                otos.add(list.get(i));
                break;
            }
        }
        return otos;
    }

    @Override
    public boolean editOto(int LicensePlate, Oto oto) {
        List<Oto> otos = getOto();
        for (int i = 0; i < otos.size(); i++) {
            if (otos.get(i).getLicensePlate() == LicensePlate) {
                otos.set(i, oto);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Oto oto1: otos){
            stringList.add(oto1.getInforToFile());
        }
        ReadAndWriteFile.writeFile(OTO_FILE,stringList,NOT_APPEND);
        return false;
    }
}
