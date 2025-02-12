package test_mo_hinh_mvc.service;

import test_mo_hinh_mvc.model.PatientVIP;
import test_mo_hinh_mvc.model.RegularPatients;

import java.util.List;

public interface IRegularPatientService {
    List<RegularPatients> getRegularPatient();

    void addRegularPatient(RegularPatients regularPatients);

    boolean editRegularPatient(int id, RegularPatients regularPatients);

    boolean deleteRegularPatient(int id);

    List<RegularPatients> searchRegularPatient(int id);
}
