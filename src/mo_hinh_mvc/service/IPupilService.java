package mo_hinh_mvc.service;

import mo_hinh_mvc.model.Pupil;
import student.model.Student;

import java.util.ArrayList;

public interface IPupilService {
    ArrayList<Pupil> getPupilAll();

    void addPupil(Pupil pupil);

    ArrayList<Pupil> searchPupil(String name);

    boolean deletePupil(String name);

    boolean editPupil(int id, Pupil pupil);
}
