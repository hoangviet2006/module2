package ss20_case_study.service.impl;

import ReadAndWriteFile.ReadAndWriteFile;
import ss20_case_study.model.Villa;
import ss20_case_study.service.IVillaService;

import java.util.*;

public class VillaService implements IVillaService {
    private static final String VILLA_FILE = "D:\\codegym\\module2\\src\\ss20_case_study\\data\\facility.csv";
    private static final boolean APPEND = true;
    private static final boolean NOT_APPEND = false;


    @Override
    public Map<Villa, Integer> getMap() {
        Map<Villa, Integer> map = new LinkedHashMap<>();
        List<String> list = ReadAndWriteFile.readFile(VILLA_FILE);
        String[] array;
        for (int i = 0; i < list.size(); i++) {
            array = list.get(i).split(",");
            if (array[1].contains("VL")) {
                map.put(new Villa(Arrays.copyOf(array, array.length - 1)), Integer.valueOf(array[array.length - 1]));
            }
        }
        return map;
    }

    @Override
    public List<Villa> getVilla() {
        List<Villa> villas = new ArrayList<>();
        List<String> list = ReadAndWriteFile.readFile(VILLA_FILE);
        String[] array;
        for (int i = 0; i < list.size(); i++) {
            array = list.get(i).split(",");
            if (array.length == 10) {
                Villa room = new Villa(Integer.parseInt(array[0]), array[1], array[2], Double.parseDouble(array[3]), Double.parseDouble(array[4]), Integer.parseInt(array[5]), array[6], array[7], Double.parseDouble(array[8]), Integer.parseInt(array[9]));
                villas.add(room);
            }
        }
        return villas;
    }

    @Override
    public void addVilla(Villa villa) {
        List<String> stringList = new ArrayList<>();
        Map<Villa,Integer> villas = getMap();
        boolean check = false;
        for (Villa villa1 : villas.keySet()) {
            if (villa1.getCode().equals(villa.getCode())) {
                check=true;
                System.out.println("Đã tồn tại");
                break;
            }

        } if (!check){
            stringList.add(villa.getInfoToFile()+","+0);
            ReadAndWriteFile.writeFile(VILLA_FILE, stringList, APPEND);
        }
    }





    @Override
    public boolean editVilla(int id, Villa villa) {
        List<Villa> villas = getVilla();
        boolean check = false;
        for (int i = 0; i < villas.size(); i++) {
            if (villas.get(i).getId() == id) {
                check = true;
                villas.set(i, villa);
                break;
            }
        }
        if (check) {
            List<String> list = new ArrayList<>();
            for (Villa villa1 : villas) {
                list.add(villa1.getInfoToFile());
            }
            ReadAndWriteFile.writeFile(VILLA_FILE, list, NOT_APPEND);
        }
        return check;
    }
}
