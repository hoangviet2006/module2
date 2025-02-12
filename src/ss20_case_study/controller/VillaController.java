package ss20_case_study.controller;

import ss20_case_study.model.Villa;
import ss20_case_study.service.impl.VillaService;
import ss20_case_study.view.VillaView;

import java.util.Map;
import java.util.Scanner;

public class VillaController {
    private static Scanner scanner = new Scanner(System.in);
    private static VillaService villaService = new VillaService();

    public void displayVilla() {
        boolean flag = true;
        while (flag) {
            System.out.println("Quản lý Villa" +
                    "\n 1. Hiển thị villa" +
                    "\n 2. Thêm villa" +
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
                    Map<Villa,Integer> villas = villaService.getMap();
                    for (Villa villa : villas.keySet()) {
                        System.out.println("Mã dịch vụ: "+villa.getCode()+" tên dịch vụ: "+villa.getName()+"  số lần thuê: "+villas.get(villa));
                    }
                    break;
                case 2:
                    villaService.addVilla(VillaView.inputVilla());
                    break;
                case 3:
                    flag=false;
            }
        }
    }
}
