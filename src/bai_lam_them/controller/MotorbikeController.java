package bai_lam_them.controller;

import bai_lam_them.model.Motorbike;
import bai_lam_them.model.Oto;
import bai_lam_them.service.MotorbikeService;
import bai_lam_them.view.MotorbikeView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorbikeController {
    public static Scanner scanner = new Scanner(System.in);
    static MotorbikeService motorbikeService = new MotorbikeService();

    public static void displayMotorbike() {
        boolean flag = true;
        while (flag) {
            System.out.println("---------Quản Lý Motorbike--------" +
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
                        List<Motorbike> motorbikes = motorbikeService.getMotorbike();
                        for (int i = 0; i < motorbikes.size(); i++) {
                            System.out.println(motorbikes.get(i));
                        }
                        break;
                    case 2:
                        Motorbike motorbike = MotorbikeView.inputMotorbike();
                        motorbikeService.addMotorbike(motorbike);
                        break;
                    case 3:
                        int licensePlate = MotorbikeView.InputlicensePlate();
                        boolean checkMotorbike = motorbikeService.deleteMotorbike(licensePlate);
                        if (checkMotorbike) {
                            System.out.println("Xóa Thành Công");
                        } else {
                            System.out.println("Không tìm thấy licensePlate");
                        }
                        break;
                    case 4:
                        int licensePlateSearch = MotorbikeView.InputlicensePlate();
                        motorbikeService.searchMotorbike(licensePlateSearch);
                        motorbikeService.getMotorbike();
                        break;
                    case 5:
                        int licensePlateEdit = MotorbikeView.InputlicensePlate();
                        Motorbike motorbike1 = new Motorbike();
                        boolean checkMotorbikeEdit = motorbikeService.edit(licensePlateEdit, motorbike1);
                        if (checkMotorbikeEdit) {
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
