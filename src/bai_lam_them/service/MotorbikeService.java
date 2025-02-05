package bai_lam_them.service;

import bai_lam_them.model.Motorbike;

import java.util.ArrayList;
import java.util.Collections;

public class MotorbikeService implements IMotorbike {
    private static ArrayList<Motorbike> motorbikes = new ArrayList<>();

    static {
        motorbikes.add(new Motorbike(123, "yamaha", 2000, "Việt", 5000));
        motorbikes.add(new Motorbike(456, "sirius", 1999, "Đạt", 2000));
        motorbikes.add(new Motorbike(789, "honda", 1988, "Lưu", 3000));
    }

    @Override
    public void addMotorbike(Motorbike motorbike) {
        motorbikes.add(motorbike);
    }

    @Override
    public ArrayList<Motorbike> getMotorbike() {
        for (int i = 0; i < motorbikes.size(); i++) {
            if (motorbikes.get(i) != null) {
                Collections.sort(motorbikes);
                System.out.println(motorbikes.get(i));
            }
        }
        return motorbikes;
    }

    @Override
    public boolean deleteMotorbike(int LicensePlate) {
        for (int i = 0; i < motorbikes.size(); i++) {
            if (motorbikes.get(i).getLicensePlate() == LicensePlate) {
                motorbikes.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Motorbike> searchMotorbike(int LicensePlate) {
        ArrayList<Motorbike> newMotorbike = new ArrayList<>();
        for (int i = 0; i < motorbikes.size(); i++) {
            if (motorbikes.get(i).getLicensePlate() == LicensePlate) {
                newMotorbike.add(motorbikes.get(i));
            }
        }
        return newMotorbike;
    }

    @Override
    public boolean edit(int LicensePlate, Motorbike motorbike) {
        for (int i = 0; i < motorbikes.size(); i++) {
            if (motorbikes.get(i).getLicensePlate() == LicensePlate) {
                motorbikes.set(i, motorbike);
                return true;
            }
        }
        return false;
    }

    public boolean checkLicensePlate(int plate) {
        for (int i = 0; i < motorbikes.size(); i++) {
            if (motorbikes.get(i).getLicensePlate() == plate) {
                return true;
            }
        }
        return false;
    }

}
