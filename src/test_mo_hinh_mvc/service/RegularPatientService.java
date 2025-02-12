package test_mo_hinh_mvc.service;

import ReadAndWriteFile.ReadAndWriteFile;
import test_mo_hinh_mvc.model.RegularPatients;

import java.util.ArrayList;
import java.util.List;

public class RegularPatientService implements IRegularPatientService {
    private final String REGULARPATIENT_FILE = "D:\\codegym\\module2\\src\\test_mo_hinh_mvc\\data\\patient.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;


    @Override
    public List<RegularPatients> getRegularPatient() {
        List<String> list = ReadAndWriteFile.readFile(REGULARPATIENT_FILE);
        List<RegularPatients> patientsList = new ArrayList<>();
        String[] array;
        for (int i = 0; i < list.size(); i++) {
            array = list.get(i).split(",");
            if (array.length==6){
                RegularPatients regularPatients = new RegularPatients(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]),array[3],array[4],Integer.parseInt(array[5]));
                patientsList.add(regularPatients);
            }

        }
        return patientsList;
    }

    @Override
    public void addRegularPatient(RegularPatients regularPatients) {
        List<String> stringList = new ArrayList<>();
        stringList.add(regularPatients.getInforRegularPatient());
        ReadAndWriteFile.writeFile(REGULARPATIENT_FILE,stringList,APPEND);
    }

    @Override
    public boolean editRegularPatient(int id, RegularPatients regularPatients) {
        List<RegularPatients> regularPatients1 = getRegularPatient();
        for (int i = 0; i < regularPatients1.size(); i++) {
            if (regularPatients1.get(i).getId()==id){
                regularPatients1.set(i,regularPatients);
                return true;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (RegularPatients regularPatients2 : regularPatients1){
            stringList.add(regularPatients2.getInforRegularPatient());
        }
        ReadAndWriteFile.writeFile(REGULARPATIENT_FILE,stringList,NOT_APPEND);
        return false;
    }

    @Override
    public boolean deleteRegularPatient(int id) {
        List<RegularPatients> patientsList = getRegularPatient();
        boolean check = false;
        for (int i = 0; i < patientsList.size(); i++) {
            if (patientsList.get(i).getId()==id){
                check=true;
                patientsList.remove(i);
                break;
            }
        }
        if (check){
            List<String> list = new ArrayList<>();
            for (RegularPatients regularPatients: patientsList){
                list.add(regularPatients.getInforRegularPatient());
            }
            ReadAndWriteFile.writeFile(REGULARPATIENT_FILE,list,NOT_APPEND);
        }
        return check;
    }

    @Override
    public List<RegularPatients> searchRegularPatient(int id) {
        List<RegularPatients> regularPatients = getRegularPatient();
        List<RegularPatients> regularPatientsList = new ArrayList<>();
        for (int i = 0; i < regularPatients.size(); i++) {
            if (regularPatients.get(i).getId()==id){
                regularPatientsList.add(regularPatients.get(i));
                break;
            }
        }
        return regularPatientsList;
    }
}
