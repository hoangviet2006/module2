package bai_lam_them.service;

import bai_lam_them.model.Truck;

import java.util.ArrayList;
import java.util.Collections;

public class TrunkService implements ITruck {

    private static ArrayList<Truck> trucks = new ArrayList<>();

    static {
        trucks.add(new Truck(123, "Yamaha", 1888, "Đạt", 20000));
        trucks.add(new Truck(456, "Honda", 1999, "Việt", 10000));
        trucks.add(new Truck(789, "Thaco", 1888, "Lưu", 15000));
    }


    @Override
    public void addTrunk(Truck truck) {
        trucks.add(truck);
    }

    @Override
    public ArrayList<Truck> getTrunk() {
        for (int i = 0; i < trucks.size(); i++) {
            if (trucks.get(i) != null) {
                Collections.sort(trucks);
                System.out.println(trucks.get(i));

            }
        }
        return trucks;
    }

    @Override
    public boolean deleteTrunk(int LicensePlate) {
        for (int i = 0; i < trucks.size(); i++) {
            if (trucks.get(i).getLicensePlate() == LicensePlate) {
                trucks.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Truck> searchTrunk(int LicensePlate) {
        ArrayList<Truck> newTrunk = new ArrayList<>();
        for (int i = 0; i < trucks.size(); i++) {
            if (trucks.get(i).getLicensePlate() == LicensePlate) {
                newTrunk.add(trucks.get(i));
            }
        }
        return newTrunk;
    }

    @Override
    public boolean edit(int LicensePlate, Truck truck) {

        for (int i = 0; i < trucks.size(); i++) {
            if (trucks.get(i).getLicensePlate() == LicensePlate) {
                trucks.set(i, truck);
                return true;
            }
        }
        return false;
    }

    public boolean checkLicensePlate(int plate) {
        for (int i = 0; i < trucks.size(); i++) {
            if (trucks.get(i).getLicensePlate() == plate) {
                return true;
            }
        }
        return false;
    }
}
