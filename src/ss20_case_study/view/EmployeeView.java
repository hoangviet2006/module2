package ss20_case_study.view;

import ss20_case_study.model.Employee;

import java.util.Scanner;

public class EmployeeView {
    private static Scanner scanner = new Scanner(System.in);

    public static Employee inputEmployee() {
            System.out.println("nhập tên nhân viên ");
            String name;
            while (true) {
                try {
                    name = scanner.nextLine().trim();
                    if (!name.isEmpty() && name.matches("^[A-Za-zÀ-Ỹà-ỹ\\s]+$")) {
                        break;
                    } else {
                        System.out.println("Vui lòng nhập tên hợp lệ! ");
                    }
                } catch (Exception e) {
                    System.out.println(" Lỗi khác!");
                }
            }
        System.out.println("Nhập ngày tháng năm sinh theo định dạng dd/mm/yy");
        String date;
        while (true) {
            try {
                date = scanner.nextLine().trim();
                if (!date.isEmpty() && date.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$")) {
                    break;
                } else {
                    System.out.println("Vui lòng nhập đúng theo định dạng");
                }
            } catch (Exception e) {
                System.out.println("Lỗi khác!");
            }
        }
        System.out.println(" Nhập giới tính");
        String gender;
        while (true) {
            try {
                gender = scanner.nextLine();
                break;
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Lỗi không phải là chữ");
            }
        }
        System.out.println("Nhập số CMND");
        String  cmnd;
        while (true) {
            try {
                cmnd =scanner.nextLine().trim();
                if (!cmnd.isEmpty()&&cmnd.matches("^\\d{12}$")){
                    break;
                }else {
                    System.out.println("Vui lòng nhập số CMND phải có 12 chữ số");
                }
            }catch (Exception e){
                System.out.println("Lỗi khác!");
            }
        }
        System.out.println("Nhập số  điện thoại");
        String phoneNumber ;
        while (true){
            try {
                phoneNumber= scanner.nextLine().trim();
                if (!phoneNumber.isEmpty()&&phoneNumber.matches("^0\\d{9}$")){
                    break;
                }else {
                    System.out.println("Vui lòng nhập số điện thoại hợp lệ");
                }
            }catch (Exception exception){
                System.out.println("Lỗi khác");
            }
        }
        System.out.println("nhập email");
        String email ;
        while (true){
            try {
                email= scanner.nextLine();
                break;
            }catch (IllegalArgumentException illegalArgumentException){
                System.out.println("Lỗi Không phải là chữ");
            }
        }
        System.out.println("Nhập mã nhân viên");
        String employeeCode ;
        while (true){
            try {
                employeeCode = scanner.nextLine().trim();
                if (!employeeCode.isEmpty()&&employeeCode.matches("^NV-\\d{4}$")){
                    break;
                }else {
                    System.out.println("Vui lòng nhập mã khách hàng theo đúng định dạng KH_xxxx");
                }
            }catch (Exception e){
                System.out.println("Lỗi khác");
            }
        }
        System.out.println("Nhập trình độ nhân viên");
        String level ;
        while (true){
            try {
                level = scanner.nextLine();
                break;
            }catch (IllegalArgumentException illegalArgumentException){
                System.out.println("Lỗi không phải là chữ");
            }
        }
        System.out.println("Nhập vị trí làm việc của nhân viên");
        String location ;
        while (true){
            try {
                location= scanner.nextLine();
                break;
            }catch (IllegalArgumentException illegalArgumentException){
                System.out.println("Lỗi không phải là số");
            }
        }
        System.out.println("Nhập tiền lương của nhân viên");
        int wage ;
        while (true){
            try {
                wage= Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException numberFormatException){
                System.out.println(" Lỗi không phải là số");
            }
        }
        Employee employee = new Employee(name, date, gender, cmnd, phoneNumber, email, employeeCode, level, location, wage);
        return employee;
    }

    public static String inputName() {
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        return name;
    }
}
