package bai_lam_them.controller;

import bai_lam_them.model.Truck;
import bai_lam_them.service.TrunkService;
import bai_lam_them.view.TrunkView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrunkController {
    public static Scanner scanner = new Scanner(System.in);
    static TrunkService trunkService = new TrunkService();

    public void displayTruck() {
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
            int count;
            while (true) {
                try {
                    count = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui lòng chọn lại chức năng");
                } catch (Exception e) {
                    System.out.println("lỗi khác");
                }
            }
            if (count <= 0 || count > 6) {
                System.out.println("vui lòng chọn lại chức năng");
            } else {
                switch (count) {
                    case 1:
                        List<Truck> truckList = trunkService.getTrunk();
                        for (int i = 0; i < truckList.size(); i++) {
                            System.out.println(truckList.get(i));
                        }
                        break;
                    case 2:
                        trunkService.addTrunk(TrunkView.inputTrunk());
                        break;
                    case 3:
                        boolean checkDelete = trunkService.deleteTrunk(TrunkView.inputlicensePlate());
                        if (checkDelete) {
                            System.out.println("Xóa thành công");
                        } else {
                            System.out.println("Không tìm thấy licensePlate");
                        }
                        break;
                    case 4:
                        trunkService.searchTrunk(TrunkView.inputlicensePlate());
                        trunkService.getTrunk();
                        break;
                    case 5:
                        boolean checkEdit = trunkService.edit(TrunkView.inputlicensePlate(), TrunkView.inputTrunk());
                        if (checkEdit) {
                            System.out.println("Chỉnh sửa thành công");
                        } else {
                            System.out.println("Không tìm thấy licensePlate");
                        }
                        break;
                    case 6:
                        flag = false;
                }
            }
        }
    }
}
