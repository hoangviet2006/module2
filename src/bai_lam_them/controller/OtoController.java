package bai_lam_them.controller;

import bai_lam_them.model.Oto;
import bai_lam_them.service.OtoService;
import bai_lam_them.view.OtoView;

import java.util.ArrayList;
import java.util.Scanner;

public class OtoController {
    public static Scanner scanner = new Scanner(System.in);
    public static OtoService otoService = new OtoService();

    public static void DisplayOto() {
        boolean flag = true;
        while (flag) {
            System.out.println("-------Quản Lý Oto-------" +
                    "\n 1. Hiển thị" +
                    "\n 2. Thêm" +
                    "\n 3. Xóa" +
                    "\n 4. Tìm Kiếm" +
                    "\n 5. Sửa" +
                    "\n 6. Quay lại menu chính");
            System.out.println("---------Chọn Chức Năng-----");
            int count = Integer.parseInt(scanner.nextLine());
            switch (count) {
                case 1:
                    otoService.getOto();
                    break;
                case 2:
                    Oto oto = OtoView.inputOto();
                    otoService.addOto(oto);
                    break;
                case 3:
                    int otoDelete = OtoView.InputlicensePlate();
                    boolean check = otoService.deleteOto(otoDelete);
                    if (check) {
                        System.out.println("XÓA THÀNH CÔNG");
                    } else {
                        System.out.println("KHÔNG TÌM THẤY BIỂN KIỂM SOÁT CẦN XÓA");
                    }
                    break;
                case 4:
                    int otoSearch = OtoView.InputlicensePlate();
                    ArrayList<Oto> otoArrayList = otoService.searchOto(otoSearch);
                    if (otoArrayList.size() > 0) {
                        System.out.println(otoArrayList);
                    } else {
                        System.out.println("KHÔNG TÌM THẤY BIỂN KIỂM SOÁT CẦN XÓA");
                    }
                    break;
                case 5:
                    int licensePlateEdit = OtoView.inputLicensePlateEDit();
                    boolean checkOto = otoService.checkLicensePlate(licensePlateEdit);
                    if (checkOto) {
                        Oto oto1 = OtoView.inputOtoEdit();
                        otoService.editOto(licensePlateEdit, oto1);
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
