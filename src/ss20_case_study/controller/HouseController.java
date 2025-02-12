package ss20_case_study.controller;

import ss20_case_study.model.House;
import ss20_case_study.service.impl.HouseService;
import ss20_case_study.view.HouseView;

import java.util.Map;
import java.util.Scanner;

public class HouseController {
    private static Scanner scanner = new Scanner(System.in);
    private static HouseService houseService = new HouseService();

    public void displayHouse() {
        boolean flag = true;
        while (flag) {
            System.out.println("Quản lý House" +
                    "\n 1. Hiển thị house" +
                    "\n 2. Thêm house" +
                    "\n 3. Quay lại menu chính");
            System.out.println("Chọn chức năng");
            int choose;
            while (true) {
                try {
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòng chọn lại chức năng!");
                }

            }
            switch (choose) {
                case 1:
                    Map<House,Integer> houseList = houseService.getMap();
                    for (House house: houseList.keySet()) {
                        System.out.println("Mã dịch vụ : "+house.getCode()+"  tên dịch vụ: "+house.getName()+"  số lần thuê: "+houseList.get(house));
                    }
                    break;
                case 2:
                    houseService.addHouse(HouseView.inputHouse());
                    break;
                case 3:
                    flag=false;
            }
        }
    }
}
