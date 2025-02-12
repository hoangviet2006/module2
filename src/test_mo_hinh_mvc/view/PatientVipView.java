package test_mo_hinh_mvc.view;

import test_mo_hinh_mvc.model.PatientVIP;

import java.util.Scanner;

public class PatientVipView {
    public static Scanner scanner = new Scanner(System.in);

    public static PatientVIP inputPatientVip() {
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
        String name /*= inputString("Tên","^^[A-Za-zÀ-Ỹà-ỹ\\s]+$", "Không nhập khoảng trắng ")*/;
        while (true) {
            name = scanner.nextLine().trim();
            if (!name.isEmpty() && name.matches("^[A-Za-zÀ-Ỹà-ỹ\\s]+$")) {
                break;
            } else {
                System.out.println("Lỗi không phải là chữ, Nhập lại: ");
            }
        }

        System.out.println("Nhập năm sinh của bệnh nhân");
        int yearOld/* = Integer.parseInt(inputString("Năm sinh", "^[1-9]\\d{3}$", "xxxx"))*/;
        while (true) {
            try {
                yearOld = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Lỗi không phải là số, Nhập lại");
            }
        }


        System.out.println("Nhập ngày nhập viện");
        String dateOfAdmission /*=inputString("Ngày nhập viên","^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$","dd/MM/yy")*/;
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
                System.out.println("Lỗi Ngày tháng phải nhập theo định dạng xx/yy/zz , Nhập lại  ");
            }
        }

        System.out.println("Nhập thời hạn VIP (Ngày) ");
        int duration;
        while (true) {
            try {
                duration = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Lỗi không phải số! thời hạn VIP phải là số, Nhập lại");
            }
        }
        String serviceQuality = " bệnh nhân vip có chất lượng phục vụ 24/7";
        PatientVIP patientVIP = new PatientVIP(id, name, yearOld, dateOfAdmission, dischargeDate, duration, serviceQuality);
        return patientVIP;
    }

    public static int inputIdPatientVip() {
        System.out.println("Nhập id bệnh nhân");
        int id;
        while (true) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Lỗi không phải là số! Id bệnh nhân phải là số, Nhập lại: ");
            }
        }
        return id;
    }

    private static String inputString(String fieldName, String regex, String typeMatch) {
        while (true) {
            try {
                String string = scanner.nextLine().trim();
                if (string.isEmpty()) {
                    System.out.println(fieldName + " không được để trống!. Nhập lại");
                } else if (!string.matches(regex)) {
                    System.out.println(fieldName + " không đúng định dạng :" + typeMatch + ", Nhập lại");
                } else {
                    return string;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
