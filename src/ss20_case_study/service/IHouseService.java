package ss20_case_study.service;

import ss20_case_study.model.House;

import java.util.List;

public interface IHouseService {
    List<House> getHouse();

    void addHouse(House house);

    boolean editHouse(int id,House house);


}
