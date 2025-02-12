package ss20_case_study.service;

import ss20_case_study.model.Room;
import ss20_case_study.model.Villa;

import java.util.List;
import java.util.Map;

public interface IVillaService {
    List<Villa> getVilla();

    void addVilla(Villa villa);

    boolean editVilla(int id, Villa villa);
    Map<Villa, Integer> getMap();


}
