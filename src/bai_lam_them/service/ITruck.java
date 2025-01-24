package bai_lam_them.service;

import bai_lam_them.model.Truck;

import java.util.ArrayList;

public interface ITruck {

    void addTrunk(Truck truck);

    ArrayList<Truck> getTrunk();

    boolean deleteTrunk(int LicensePlate);

    ArrayList<Truck> searchTrunk(int LicensePlate);
    boolean edit(int LicensePlate, Truck truck);
}
