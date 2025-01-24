package bai_lam_them.service;

import bai_lam_them.model.Oto;

import java.util.ArrayList;

public interface IOto {
    void addOto(Oto oto);

    ArrayList<Oto> getOto();

    boolean deleteOto(int LicensePlate);

    ArrayList<Oto> searchOto(int LicensePlate);
    boolean editOto(int LicensePlate , Oto oto);
}
