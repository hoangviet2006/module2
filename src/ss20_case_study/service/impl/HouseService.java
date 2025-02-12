package ss20_case_study.service.impl;

import ReadAndWriteFile.ReadAndWriteFile;
import ss20_case_study.model.House;
import ss20_case_study.service.IHouseService;

import java.util.*;

public class HouseService implements IHouseService {
    private static final String HOUSE_FILE = "D:\\codegym\\module2\\src\\ss20_case_study\\data\\facility.csv";
    private static final boolean APPEND = true;
    private static final boolean NOT_APPEND = false;


    public Map<House, Integer> getMap() {
        Map<House, Integer> map = new LinkedHashMap<>();
        List<String> list = ReadAndWriteFile.readFile(HOUSE_FILE);
        String[] array;
        for (int i = 0; i < list.size(); i++) {
            array = list.get(i).split(",");
            if (array[1].contains("HO")) {
                map.put(new House(Arrays.copyOf(array, array.length - 1)), Integer.valueOf(array[array.length - 1]));
            }
        }
        return map;
    }

    @Override
    public List<House> getHouse() {
        List<House> houseList = new ArrayList<>();
        List<String> list = ReadAndWriteFile.readFile(HOUSE_FILE);
        String[] array;
        for (int i = 0; i < list.size(); i++) {
            array = list.get(i).split(",");
            if (array.length == 9) {
                House house = new House(Integer.parseInt(array[0]), array[1], array[2], Double.parseDouble(array[3]), Double.parseDouble(array[4]), Integer.parseInt(array[5]), array[6], array[7], Integer.parseInt(array[8]));
                houseList.add(house);
            }
        }
        return houseList;
    }

    @Override
    public void addHouse(House house) {
        List<String> stringList = new ArrayList<>();
        Map<House, Integer> map = getMap();
        boolean check = false;
        for (House house1 : map.keySet()) {
            if (house1.getCode().equals(house.getCode())) {
                check = true;
                System.out.println("Đã tồn tại");
                break;
            }
        }
        int value =0;
        if (!check) {
            stringList.add(house.getInfoToFile() + "," + value);
            ReadAndWriteFile.writeFile(HOUSE_FILE, stringList, APPEND);
        }
    }

    @Override
    public boolean editHouse(int id, House house) {
        List<House> houseList = getHouse();
        boolean check = false;
        for (int i = 0; i < houseList.size(); i++) {
            if (houseList.get(i).getId() == id) {
                check = true;
                houseList.set(i, house);
                break;
            }
        }
        if (check) {
            List<String> list = new ArrayList<>();
            for (House house1 : houseList) {
                list.add(house1.getInfoToFile());
            }
            ReadAndWriteFile.writeFile(HOUSE_FILE, list, NOT_APPEND);
        }
        return check;
    }


}
