package bai_lam_them.controller;

import bai_lam_them.model.Truck;
import bai_lam_them.service.TrunkService;
import bai_lam_them.view.TrunkView;

import java.util.ArrayList;
import java.util.Scanner;

public class TrunkController {
    public static Scanner scanner = new Scanner(System.in);
    static TrunkService trunkService = new TrunkService();

    public static void DisplayMotorbike() {
        boolean flag = true;
        while (flag) {
            System.out.println("---------Quản Lý trunk--------" +
                    "\n 1. Hiển thị" +
                    "\n 2. Thêm" +
                    "\n 3. Xóa" +
                    "\n 4. Tìm Kiếm" +
                    "\n 5. Sửa" +
                    "\n 6. Quay lại menu chính");
            System.out.println("-------Chọn Chức Năng---------");
            int count = Integer.parseInt(scanner.nextLine());
            switch (count) {
                case 1:
                    trunkService.getTrunk();
                    break;
                case 2:
                    Truck truck = TrunkView.inputTrunk();
                    trunkService.addTrunk(truck);
                    break;
                case 3:
                    int trunkDelete = TrunkView.inputlicensePlate();
                    boolean check = trunkService.deleteTrunk(trunkDelete);
                    if (check) {
                        System.out.println("XÓA THÀNH CÔNG");
                    } else {
                        System.out.println("KHÔNG TÌM THẤY BIỂN KIỂM SOÁT CẦN XÓA");
                    }
                    break;
                case 4:
                    int trunkSearch = TrunkView.inputlicensePlate();
                    ArrayList<Truck> trucks = trunkService.searchTrunk(trunkSearch);
                    if (trucks.size() > 0) {
                        System.out.println(trucks);
                    } else {
                        System.out.println("KHÔNG TÌM THẤY BIỂN KIỂM SOÁT CẦN XÓA");
                    }
                    break;
                case 5:
                    int plateEdit = TrunkView.inputLicensePlateEDit();
                    boolean checkPlate = trunkService.checkLicensePlate(plateEdit);
                    if (checkPlate) {
                        Truck truckedit = TrunkView.editTrunk();
                        trunkService.edit(plateEdit, truckedit);
                        System.out.println("CHỈNH SỬA THÀNH CÔNG");
                    } else {
                        System.out.println("KHÔNG TÌM THẤY BIỂN KIỂM SOÁT CẦN CHỈNH SỬA");
                    }
                    break;
                case 6:
                    flag = false;
            }
        }
    }
}
