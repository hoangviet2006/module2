package test_mo_hinh_mvc.controller;

import test_mo_hinh_mvc.model.PatientVIP;
import test_mo_hinh_mvc.model.RegularPatients;
import test_mo_hinh_mvc.service.IPatientVipService;
import test_mo_hinh_mvc.service.PatientVipService;
import test_mo_hinh_mvc.service.RegularPatientService;
import test_mo_hinh_mvc.view.PatientVipView;
import test_mo_hinh_mvc.view.RegularPatientView;

import java.util.List;
import java.util.Scanner;

public class PatientVipController {
     static Scanner scanner = new Scanner(System.in);
     static IPatientVipService patientVipService = new PatientVipService();

    public  void disPlayRegularPatient() {
        boolean flag = true;
        while (flag) {
            System.out.println("Quản lý bệnh nhân VIP" +
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
                    List<PatientVIP> list = patientVipService.getPatientVip();
//
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                        System.out.println("---------------------");
                    }
                    break;
                case 2:
                    patientVipService.addPatientVip(PatientVipView.inputPatientVip());
                    break;
                case 3:
                    boolean checkEdit = patientVipService.editPatientVip(PatientVipView.inputIdPatientVip(), PatientVipView.inputPatientVip());
                    if (checkEdit) {
                        System.out.println("Chỉnh sửa thành công");
                    } else {
                        System.out.println("Không tìm thấy id bệnh nhân");
                    }
                    break;
                case 4:
                    boolean checkDelete = patientVipService.deletePatientVip(PatientVipView.inputIdPatientVip());
                    if (checkDelete) {
                        System.out.println("Xóa thành công");
                    } else {
                        System.out.println("Không tìm thấy id bệnh nhân");
                    }
                    break;
                case 5:
                    List<PatientVIP> regularPatients = patientVipService.searchPatientVip(PatientVipView.inputIdPatientVip());
                    for (int i = 0; i < regularPatients.size(); i++) {
                        if (regularPatients.get(i) != null) {
                            System.out.println(regularPatients.get(i));
                            break;
                        }
                    }
                    break;
                case 6:
                    flag = false;
            }
        }
    }
}
