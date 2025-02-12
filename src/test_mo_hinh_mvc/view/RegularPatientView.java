package test_mo_hinh_mvc.view;

import test_mo_hinh_mvc.model.RegularPatients;

import java.util.Scanner;

public class RegularPatientView {
    public static Scanner scanner = new Scanner(System.in);
    public static RegularPatients inputRegularPatient(){
        System.out.println("Nhập id bệnh nhân");
        int id;
        while (true) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Lỗi không phải số! id phải là số, Nhập lại: ");
            }
        }

        System.out.println("Nhập tên bệnh nhân");
        String name;
        while (true) {
            name = scanner.nextLine().trim();
            if (!name.isEmpty() && name.matches("^[A-ZÀ-Ỹ][a-zà-ỹ]+(\s[A-ZÀ-Ỹ][a-zà-ỹ]+)*$")) {
                break;
            } else {
                System.out.println("Lỗi không phải là chữ, Nhập lại: ");
            }
        }

        System.out.println("Nhập năm sinh của bệnh nhân");
        int yearOld;
        while (true) {
            try {
                yearOld = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException numberFormatException){
                System.out.println("Lỗi không phải là số,Nhập lại");
            }
        }

        System.out.println("Nhập ngày nhập viện");
        String dateOfAdmission;
        while (true) {
            dateOfAdmission = scanner.nextLine().trim();
            if (!dateOfAdmission.isEmpty() && dateOfAdmission.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$")) {
                break;
            } else {
                System.out.println("Lỗi Ngày tháng phải nhập theo định dạng xx/yy/zz , Nhập lại  ");
            }
        }

        System.out.println(" Nhập ngày xuất viện");
        String dischargeDate;
        while (true) {
            dischargeDate = scanner.nextLine().trim();
            if (!dischargeDate.isEmpty() && dischargeDate.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$")) {
                break;
            } else {
                System.out.println("Lỗi Ngày tháng phải nhập theo định dạng xx/yy/zz , Nhập lại ");
            }
        }

        System.out.println("Nhập viện phí của bệnh nhân (milion)");
        int hospitalFees;
        while (true){
            try {
                hospitalFees=Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException numberFormatException){
                System.out.println("Lỗi không phải là số! tiền viện phí phải là số, Nhập lại");
            }
        }
        RegularPatients regularPatients = new RegularPatients(id,name,yearOld,dateOfAdmission,dischargeDate,hospitalFees);
        return regularPatients;
    }
    public static int inputIdRegularPatient(){
            System.out.println("Nhập id bệnh nhân");
            int id;
            while (true){
                try {
                    id=Integer.parseInt(scanner.nextLine());
                    break;
                }catch (NumberFormatException numberFormatException){
                    System.out.println("Lỗi không phải là số! Id bệnh nhân phải là số, Nhập lại: ");
                }
            }
            return id;
    }
}
