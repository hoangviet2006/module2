package test_mo_hinh_mvc.service;

import test_mo_hinh_mvc.model.PatientVIP;

import java.util.List;

public interface IPatientVipService {
    List<PatientVIP> getPatientVip();

    void addPatientVip(PatientVIP patientVIP);

    boolean editPatientVip(int id, PatientVIP patientVIP);

    boolean deletePatientVip(int id);

    List<PatientVIP> searchPatientVip(int id);
}
