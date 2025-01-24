package bai_lam_them.service;

import bai_lam_them.model.Oto;

import java.util.ArrayList;
import java.util.Collections;

public class OtoService implements IOto{

    private static ArrayList<Oto> otos = new ArrayList<>();
    static {
        otos.add(new Oto(123,"lexus",1888,"Lưu",4,"family"));
        otos.add(new Oto(456,"Honda",1999,"Việt",9,"family"));
        otos.add(new Oto(789,"ferrari",2000,"Đạt",2,"family"));
    }
    @Override
    public void addOto(Oto oto) {
            otos.add(oto);
    }

    @Override
    public ArrayList<Oto> getOto() {
        for (int i = 0; i < otos.size(); i++) {
            if (otos.get(i)!=null){
                Collections.sort(otos);
                System.out.println(otos.get(i));

            }
        }
        return otos;
    }

    @Override
    public boolean deleteOto(int LicensePlate) {
        for (int i = 0; i < otos.size(); i++) {
            if (otos.get(i).getLicensePlate()==LicensePlate){
                otos.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Oto> searchOto(int LicensePlate) {
        ArrayList<Oto> newOto = new ArrayList<>();
        for (int i = 0; i < otos.size(); i++) {
            if (otos.get(i).getLicensePlate()==LicensePlate){
                newOto.add(otos.get(i));
            }
        }
        return newOto;
    }

    @Override
    public boolean editOto(int LicensePlate, Oto oto) {
        for (int i = 0; i < otos.size(); i++) {
            if (otos.get(i).getLicensePlate()==LicensePlate){
                otos.set(i,oto);
                return true;
            }
        }
        return false;
    }
    public boolean checkLicensePlate(int plate){
        for (int i = 0; i < otos.size(); i++) {
            if (otos.get(i).getLicensePlate()==plate){
                return true;
            }
        }
        return false;
    }

}
