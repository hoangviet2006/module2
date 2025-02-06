package bai_lam_them.service;

import bai_lam_them.model.Motorbike;

import java.util.ArrayList;
import java.util.List;

public interface IMotorbike {

    void addMotorbike(Motorbike motorbike);

    List<Motorbike> getMotorbike();

    boolean deleteMotorbike(int LicensePlate);

    List<Motorbike> searchMotorbike(int LicensePlate);

    boolean edit(int LicensePlate, Motorbike motorbike);
}
