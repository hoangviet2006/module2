package bai_lam_them.controller;

import bai_lam_them.model.Motorbike;
import bai_lam_them.service.MotorbikeService;
import bai_lam_them.view.MotorbikeView;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorbikeController {
    public static Scanner scanner = new Scanner(System.in);
    static MotorbikeService motorbikeService = new MotorbikeService();

    public static void DisplayMotorbike() {
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
                        motorbikeService.getMotorbike();
                        break;
                    case 2:
                        Motorbike motorbike = MotorbikeView.inputMotorbike();
                        motorbikeService.addMotorbike(motorbike);
                        break;
                    case 3:
                        int motoDelete = MotorbikeView.InputlicensePlate();
                        boolean check = motorbikeService.deleteMotorbike(motoDelete);
                        if (check) {
                            System.out.println("XÓA THÀNH CÔNG");
                        } else {
                            System.out.println("KHÔNG TÌM THẤY BIỂN KIỂM SOÁT CẦN XÓA");
                        }
                        break;
                    case 4:
                        int motoSearch = MotorbikeView.InputlicensePlate();
                        ArrayList<Motorbike> motorbikes = motorbikeService.searchMotorbike(motoSearch);
                        if (motorbikes.size() > 0) {
                            for (Motorbike motorbike1 : motorbikes) {
                                System.out.println(motorbike1);
                            }
                        } else {
                            System.out.println("KHÔNG TÌM THẤY BIỂN KIỂM SOÁT CẦN XÓA");
                        }
                        break;
                    case 5:
                        int licensePlateEdit = MotorbikeView.InputlicensePlate();
                        boolean checkMotorbike = motorbikeService.checkLicensePlate(licensePlateEdit);
                        if (checkMotorbike) {
                            Motorbike motorbikeEdit = MotorbikeView.editMotorbike();
                            motorbikeService.edit(licensePlateEdit, motorbikeEdit);
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

}
