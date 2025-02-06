package bai_lam_them.service;

import bai_lam_them.model.Oto;

import java.util.ArrayList;
import java.util.List;

public interface IOto {
    void addOto(Oto oto);

    List<Oto> getOto();

    boolean deleteOto(int LicensePlate);

    List<Oto> searchOto(int LicensePlate);
    boolean editOto(int LicensePlate , Oto oto);
}
