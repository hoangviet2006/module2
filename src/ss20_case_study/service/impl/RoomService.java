package ss20_case_study.service.impl;

import ReadAndWriteFile.ReadAndWriteFile;
import ss20_case_study.model.Room;
import ss20_case_study.service.IRoomService;

import java.util.*;


public class RoomService implements IRoomService {
    private static final String ROOM_FILE = "D:\\codegym\\module2\\src\\ss20_case_study\\data\\facility.csv";
    private static final boolean APPEND = true;
    private static final boolean NOT_APPEND = false;

    public Map<Room, Integer> getMap() {
        Map<Room, Integer> map = new LinkedHashMap<>();
        List<String> list = ReadAndWriteFile.readFile(ROOM_FILE);
        String[] array;
        for (int i = 0; i < list.size(); i++) {
            array = list.get(i).split(",");
            if (array[1].contains("RO")) {
                map.put(new Room(Arrays.copyOf(array, array.length - 1)), Integer.valueOf(array[array.length - 1]));
            }
        }
        return map;
    }

    @Override
    public List<Room> getRoom() {
        List<Room> roomList = new ArrayList<>();
        List<String> list = ReadAndWriteFile.readFile(ROOM_FILE);
        String[] array;
        for (int i = 0; i < list.size(); i++) {
            array = list.get(i).split(",");
            if (array.length == 8) {
                Room room = new Room(Integer.parseInt(array[0]), array[1], array[2], Double.parseDouble(array[3]), Double.parseDouble(array[4]), Integer.parseInt(array[5]), array[6], array[7]);
                roomList.add(room);
            }
        }
        return roomList;
    }

    @Override
    public void addRoom(Room room) {
        List<String> stringList = new ArrayList<>();
        Map<Room, Integer> map = getMap();
        boolean check = false;
        for (Room room1 : map.keySet()) {
            if (room1.getCode().equals(room.getCode())) {
                check = true;
                System.out.println("Đã tồn tại");
                break;
            }
        }
        if (!check) {
            stringList.add(room.getInfoToFile() + "," + 0);
            ReadAndWriteFile.writeFile(ROOM_FILE, stringList, APPEND);
        }

    }

    @Override
    public boolean editRoom(int id, Room room) {
        List<Room> roomList = getRoom();
        boolean check = false;
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getId() == id) {
                check = true;
                roomList.set(i, room);
                break;
            }
        }
        if (check) {
            List<String> list = new ArrayList<>();
            for (Room room1 : roomList) {
                list.add(room1.getInfoToFile());
            }
            ReadAndWriteFile.writeFile(ROOM_FILE, list, NOT_APPEND);
        }
        return check;
    }


}
