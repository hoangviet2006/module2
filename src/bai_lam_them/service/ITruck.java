package bai_lam_them.service;

import bai_lam_them.model.Truck;

import java.util.ArrayList;
import java.util.List;

public interface ITruck {

    void addTrunk(Truck truck);

    List<Truck> getTrunk();

    boolean deleteTrunk(int LicensePlate);

    List<Truck> searchTrunk(int LicensePlate);
    boolean edit(int LicensePlate, Truck truck);
}
