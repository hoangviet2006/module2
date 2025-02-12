package test_mo_hinh_mvc.controller;

import test_mo_hinh_mvc.model.RegularPatients;
import test_mo_hinh_mvc.service.IRegularPatientService;
import test_mo_hinh_mvc.service.RegularPatientService;
import test_mo_hinh_mvc.view.RegularPatientView;

import java.util.List;
import java.util.Scanner;

public class RegularPatientController {
     static Scanner scanner = new Scanner(System.in);
     static IRegularPatientService regularPatientService = new RegularPatientService();

    public  void disPlayRegularPatient() {
        boolean flag = true;
        while (flag) {
            System.out.println("Quản lý bệnh nhân thường" +
                    "\n 1. Hiển thị" +
                    "\n 2. Thêm bệnh nhân" +
                    "\n 3. chỉnh sửa bệnh nhân" +
                    "\n 4. Xóa bệnh nhân" +
                    "\n 5. Tìm Kiếm bệnh nhân" +
                    "\n 6. Quay lại menu chính");
            System.out.println("Chọn chức năng");
            int choose;
            while (true) {
                try {
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Lỗi bạn vừa nhập không phải là số! Nhập lại");
                }
            }
            if (choose < 1 || choose > 6) {
                System.out.println("Chọn lại chức năng");
            }
            switch (choose) {
                case 1:
                    List<RegularPatients> list = regularPatientService.getRegularPatient();
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                        System.out.println("---------------------");
                    }
                    break;
                case 2:
                    regularPatientService.addRegularPatient(RegularPatientView.inputRegularPatient());
                    break;
                case 3:
                    boolean checkEdit = regularPatientService.editRegularPatient(RegularPatientView.inputIdRegularPatient(), RegularPatientView.inputRegularPatient());
                    if (checkEdit) {
                        System.out.println("Chỉnh sửa thành công");
                    } else {
                        System.out.println("Không tìm thấy id bệnh nhân");
                    }
                    break;
                case 4:
                    boolean checkDelete = regularPatientService.deleteRegularPatient(RegularPatientView.inputIdRegularPatient());
                    if (checkDelete) {
                        System.out.println("Xóa thành công");
                    } else {
                        System.out.println("Không tìm thấy id bệnh nhân");
                    }
                    break;
                case 5:
                    List<RegularPatients> regularPatients = regularPatientService.searchRegularPatient(RegularPatientView.inputIdRegularPatient());
                    for (int i = 0; i < regularPatients.size(); i++) {
                        if (regularPatients.get(i)!=null){
                            System.out.println(regularPatients.get(i));
                            break;
                        }
                    }
                    break;
                case 6:
                    flag=false;
            }
        }
    }

}
