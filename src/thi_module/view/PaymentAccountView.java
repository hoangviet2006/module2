package thi_module.view;

import thi_module.model.PaymentAccount;

import java.util.Scanner;

public class PaymentAccountView {
    private static Scanner scanner = new Scanner(System.in);

    public static PaymentAccount inputPayment() {
        System.out.println("nhập mã tài khoản");
        String code;
        while (true) {
            try {
                code = scanner.nextLine();
                if (code.matches("^\\d{9}$")) {
                    break;
                }else {
                    System.out.println("Mã tài khoản có 9 chữ số");
                }
            } catch (Exception e) {
                System.out.println("Lỗi Mã tài khoản có 9 chữ số");
            }
        }
        System.out.println("nhập tên chủ tài khoản");
        String name;
        while (true) {
            try {
                name = scanner.nextLine();
                if (name.matches("^[A-Z][a-z]*(?: [A-Z][a-z]*)*$")) {
                    break;
                }else {
                    System.out.println("Tên phải bắt đầu bằng chữ hoa");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Lỗi tên chủ sở hữu không đúng");
            }
        }
        System.out.println("nhập ngày tạo tài khoản");
        String date;
        while (true) {
            try {
                date = scanner.nextLine();
                if (date.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$")) {
                    break;
                }else {
                    System.out.println("Lỗi ngày tạo tài khoàn không đúng định dạng");
                }
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Lỗi ngày tạo tài khoàn không đúng định dạng");
            }
        }
        System.out.println("Nhập số thẻ");
        int cardNumber;
        while (true) {
            try {
                cardNumber = Integer.parseInt(scanner.nextLine());
                if (cardNumber <= 0) {
                    System.out.println("số thẻ phải là số dương");
                }else {
                    break;
                }

            } catch (NumberFormatException n) {

            }
        }
        System.out.println("Nhập số tiền trong tài khoản");
        int amount;
        while (true){
            try {
                amount = Integer.parseInt(scanner.nextLine());
                if (amount <= 0) {
                    System.out.println("số tiền trong thẻ phải là số dương");
                }else {
                    break;
                }

            }catch (NumberFormatException numberFormatException){
                System.out.println("Lỗi không phải là số");
            }
        }
        PaymentAccount paymentAccount = new PaymentAccount(0,code,name,date,cardNumber,amount);
        return paymentAccount;
    }

    public static String inputName() {
        System.out.println("nhập tên chủ tài khoản");
        String name;
        while (true) {
            try {
                name = scanner.nextLine();
                if (name.matches("^[A-Z][a-z]*(?: [A-Z][a-z]*)*$")) {
                    break;
                }else {
                    System.out.println("Lỗi tên chủ sở hữu phải bắt đầu bằng chữ hoa");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Lỗi tên chủ sở hữu không đúng");
            }
        }
        return name;
    }
}
