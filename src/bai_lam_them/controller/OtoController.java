package bai_lam_them.controller;

import bai_lam_them.model.Oto;
import bai_lam_them.service.OtoService;
import bai_lam_them.view.OtoView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OtoController {
    public static Scanner scanner = new Scanner(System.in);
    public static OtoService otoService = new OtoService();

    public static void displayOto() {
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
                        List<Oto> list = otoService.getOto();
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println(list.get(i));
                        }
                        break;
                    case 2:
                        otoService.addOto(OtoView.inputOto());
                        break;
                    case 3:
                        boolean checkDeleteOto = otoService.deleteOto(OtoView.InputlicensePlate());
                        if (checkDeleteOto) {
                            System.out.println("Xóa thành công");
                        } else {
                            System.out.println("Không tìm thấy licensePlate");
                        }
                    case 4:
                        otoService.searchOto(OtoView.InputlicensePlate());
                        otoService.getOto();
                        break;
                    case 5:
                        boolean checkEditOto = otoService.editOto(OtoView.InputlicensePlate(), OtoView.inputOto());
                        if (checkEditOto) {
                            System.out.println("Chỉnh sửa thành công");
                        }else {
                            System.out.println("Không tìm thấy licensePlate");
                        }
                    case 6:
                        flag = false;
                }
            }
        }
    }
}
