package test_mo_hinh_mvc.service;

import ReadAndWriteFile.ReadAndWriteFile;
import test_mo_hinh_mvc.model.PatientVIP;
import test_mo_hinh_mvc.model.RegularPatients;

import java.util.ArrayList;
import java.util.List;

public class PatientVipService implements IPatientVipService{
    private final String PATIENTVIP_FILE = "D:\\codegym\\module2\\src\\test_mo_hinh_mvc\\data\\patient.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;


    @Override
    public List<PatientVIP> getPatientVip() {
        List<String> list = ReadAndWriteFile.readFile(PATIENTVIP_FILE);
        List<PatientVIP> patientsList = new ArrayList<>();
        String[] array;
        for (int i = 0; i < list.size(); i++) {
            array = list.get(i).split(",");
            if (array.length==7){
                PatientVIP patientVIP = new PatientVIP(Integer.parseInt(array[0]),array[1],Integer.parseInt(array[2]),array[3],array[4],Integer.parseInt(array[5]),array[6]);
                patientsList.add(patientVIP);
            }

        }
        return patientsList;
    }

    @Override
    public void addPatientVip(PatientVIP patientVIP) {
        List<String> stringList = new ArrayList<>();
        stringList.add(patientVIP.getInforPatientVip());
        ReadAndWriteFile.writeFile(PATIENTVIP_FILE,stringList,APPEND);
    }

    @Override
    public boolean editPatientVip(int id, PatientVIP patientVIP) {
        List<PatientVIP> patientVip = getPatientVip();
        for (int i = 0; i < patientVip.size(); i++) {
            if (patientVip.get(i).getId()==id){
                patientVip.set(i,patientVIP);
                return true;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (PatientVIP patientVIP1 : patientVip){
            stringList.add(patientVIP1.getInforPatientVip());
        }
        ReadAndWriteFile.writeFile(PATIENTVIP_FILE,stringList,NOT_APPEND);
        return false;
    }

    @Override
    public boolean deletePatientVip(int id) {
        List<PatientVIP> patientVip = getPatientVip();
        boolean check = false;
        for (int i = 0; i < patientVip.size(); i++) {
            if (patientVip.get(i).getId()==id){
                check=true;
                patientVip.remove(i);
                break;
            }
        }
        if (check){
            List<String> list = new ArrayList<>();
            for (PatientVIP patientVIP: patientVip){
                list.add(patientVIP.getInforPatientVip());
            }
            ReadAndWriteFile.writeFile(PATIENTVIP_FILE,list,NOT_APPEND);
        }
        return check;
    }

    @Override
    public List<PatientVIP> searchPatientVip(int id) {
        List<PatientVIP> patientVip = getPatientVip();
        List<PatientVIP> patientVIPS = new ArrayList<>();
        for (int i = 0; i < patientVip.size(); i++) {
            if (patientVip.get(i).getId()==id){
                patientVIPS.add(patientVip.get(i));
                break;
            }
        }
        return patientVIPS;
    }
}
