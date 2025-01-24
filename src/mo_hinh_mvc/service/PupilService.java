package mo_hinh_mvc.service;

import mo_hinh_mvc.model.Pupil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PupilService implements IPupilService {
    public static ArrayList<Pupil> pupils = new ArrayList<>();

    static {
        pupils.add(new Pupil(1, "Hoàng Việt", 9, 8, 7, 30032006));
        pupils.add(new Pupil(2, "Xuân Đạt", 8, 7, 8, 30032006));
        pupils.add(new Pupil(3, "Trung Chiến", 9, 9, 9, 30032006));
    }

    @Override
    public ArrayList<Pupil> getPupilAll() {
        for (int i = 0; i < pupils.size(); i++) {
            if (pupils.get(i) != null) {
                Collections.sort(pupils);
                System.out.println(pupils.get(i));
            }
        }
        return pupils;
    }

    @Override
    public void addPupil(Pupil pupil) {
        pupils.add(pupil);
    }

    @Override
    public ArrayList<Pupil> searchPupil(String name) {
        ArrayList<Pupil> newArray = new ArrayList<>();
        for (int i = 0; i < pupils.size(); i++) {
            if (pupils.get(i).getName().contains(name)) {
                newArray.add(pupils.get(i));
            }
        }
        return newArray;
    }

    @Override
    public boolean deletePupil(String name) {
        for (int i = 0; i < pupils.size(); i++) {
            if (pupils.get(i).getName().equals(name)){
                pupils.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean editPupil(int id, Pupil pupil) {
        for (int i = 0; i < pupils.size(); i++) {
            if (pupils.get(i).getId()==id){
                pupils.set(i,pupil);
                return true;
            }
        }
        return false;
    }
}
