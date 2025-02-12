package ss20_case_study.view;

import ss20_case_study.model.Booking;

import java.util.Scanner;

public class BookingView {
    private static Scanner scanner = new Scanner(System.in);

    public static Booking inputBooking() {
        System.out.println("Nhập id booking");
        int id;
        while (true) {
            try {
                id = Integer.parseInt(scanner.nextLine());

                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Lôi không phải là số!");
            }
        }
        System.out.println("Nhập mã booking");
        String code ;
        while (true){
            try {
                code= scanner.nextLine().trim();
                if (code.matches("^[A-Z]{2}-\\d{3}$")){
                    break;
                }else {
                    System.out.println("Không đúng định dạng! mã booking phải theo định dạng XX-000");
                }
            }catch (Exception e){
                System.out.println("Lỗi khác!");
            }
        }
        Booking booking = new Booking(id, code);
        return booking;
    }

//    public static String inputServiceCode() {
//        System.out.println("Nhập mã khách hàng");
//        String serviceCode = scanner.nextLine();
//        return serviceCode;
//    }
//
//    public static String inputCustomerCode() {
//        System.out.println("Nhập mã dịch vụ");
//        String customerCode = scanner.nextLine();
//        return customerCode;
//    }
}
