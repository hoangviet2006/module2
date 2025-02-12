package ss20_case_study.view;

import ReadAndWriteFile.ReadAndWriteFile;
import ss1_introduction_to_java.thuc_hanh.SystemTime;
import ss20_case_study.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private static Scanner scanner = new Scanner(System.in);

    public static Customer inputCustomer() {
        System.out.println("nhập tên khách hàng");
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
                if (cmnd.matches("^\\d{12}$")){
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
                if (phoneNumber.matches("^0\\d{9}$")){
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
        System.out.println("Nhập mã khách hàng");
        String customerCode;
        while (true){
            try {
                customerCode = scanner.nextLine().trim();
                if (!customerCode.isEmpty()&&customerCode.matches("^KH-\\d{4}$")){
                    break;
                }else {
                    System.out.println("Vui lòng nhập mã khách hàng theo đúng định dạng KH-xxxx");
                }
            }catch (Exception e){
                System.out.println("Lỗi khác");
            }
        }
        System.out.println("Nhập loại khách hàng");
        String typeOfGuest ;
        while (true){
            try {
                typeOfGuest= scanner.nextLine();
                break;
            }catch (IllegalArgumentException illegalArgumentException){
                System.out.println("Lỗi không phải là chữ ");
            }
        }
        System.out.println("Nhập địa chỉ");
        String address;
        while (true){
            try {
                address = scanner.nextLine();
                break;
            }catch (IllegalArgumentException illegalArgumentException){
                System.out.println("Lỗi không phải là chữ ");
            }
        }
        Customer customer = new Customer(name, date, gender, cmnd, phoneNumber, email, customerCode, typeOfGuest, address);
        return customer;
    }

    public static String inputName() {
        System.out.println("Nhập tên");
        String name ;
        while (true){
            try {
                name= scanner.nextLine();
                break;
            }catch (IllegalArgumentException illegalArgumentException){
                System.out.println("Lỗi không phải là chữ");
            }
        }
        return name;
    }
}
