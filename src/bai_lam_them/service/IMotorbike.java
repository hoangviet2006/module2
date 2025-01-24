package bai_lam_them.service;

import bai_lam_them.model.Motorbike;

import java.util.ArrayList;

public interface IMotorbike {

    void addMotorbike(Motorbike motorbike);

    ArrayList<Motorbike> getMotorbike();

    boolean deleteMotorbike(int LicensePlate);

    ArrayList<Motorbike> searchMotorbike(int LicensePlate);

    boolean edit(int LicensePlate, Motorbike motorbike);
}
