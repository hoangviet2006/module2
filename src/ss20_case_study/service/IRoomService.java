package ss20_case_study.service;

import ss20_case_study.model.House;
import ss20_case_study.model.Room;

import java.util.List;

public interface IRoomService {
    List<Room> getRoom();

    void addRoom(Room room);

    boolean editRoom(int id , Room room);


}
