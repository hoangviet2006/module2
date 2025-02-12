package test_mo_hinh_mvc.view;

import test_mo_hinh_mvc.controller.PatientVipController;
import test_mo_hinh_mvc.controller.RegularPatientController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegularPatientController regularPatientController = new RegularPatientController();
        PatientVipController patientVipController = new PatientVipController();
        while (true){
            System.out.println("Quản lý bệnh nhân" +
                    "\n 1. Quản lý bệnh nhân thường" +
                    "\n 2. Quản lý bệnh nhân VIP");
            System.out.println("Chọn chức năng");
            int choose;
            while (true){
                try {
                    choose=Integer.parseInt(scanner.nextLine());
                    break;
                }catch (NumberFormatException numberFormatException){
                    System.out.println("Lỗi bạn vừa nhập không phải là số! Nhập lại");
                }
            }
            switch (choose){
                case 1:
                    
                    regularPatientController.disPlayRegularPatient();
                    break;
                case 2:
                    patientVipController.disPlayRegularPatient();
                    break;
                case 3:
                    System.exit(0);
            }
        }

    }
}
