package thi_module.view;

import thi_module.model.PaymentAccount;
import thi_module.model.SavingsAccount;

import java.util.Scanner;

public class SavingAccountView {
    private static Scanner scanner = new Scanner(System.in);

    public static SavingsAccount inputPayment() {
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
            } catch (IllegalArgumentException e) {
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
        System.out.println("nhập số tiền tiết kiệm");
        int savingsAmount;
        while (true){
            try {
                savingsAmount = Integer.parseInt(scanner.nextLine());
                if (savingsAmount<=0){
                    System.out.println("số tiền tiết kiệm phải là số dương");
                }
                break;
            }catch (NumberFormatException numberFormatException){
                System.out.println("Lỗi không phải là số");
            }
        }
        System.out.println("Nhập ngày gửi");
        String savingsDate;
        while (true) {
            try {
                savingsDate = scanner.nextLine();
                if (date.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$")) {
                    break;
                }else {
                    System.out.println("Lỗi ngày gửi không đúng định dạng");
                }
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Lỗi ngày gửi không đúng định dạng");
            }
        }

        System.out.println("nhập kì hạn");
        int interestRate = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập lãi xuất");
        String term ;
        while (true){
            try {
                term= scanner.nextLine();
                if (term.matches("^\\d+(\\.\\d+)?%$")){
                    break;
                }else {
                    System.out.println("Lỗi không đúng định dạng lãi xuất phải có %");
                }
            }catch (IllegalArgumentException illegalArgumentException){
                System.out.println("Lỗi không đúng định dạng lãi xuất phải có %");
            }
        }

        SavingsAccount savingsAccount = new SavingsAccount(0, code, name, date, savingsAmount, savingsDate, interestRate, term);
        return savingsAccount;
    }
    public static String inputName(){
        String name;
        while (true) {
            try {
                name = scanner.nextLine();
                if (name.matches("^[A-Z][a-z]")) {
                    break;
                }else {
                    System.out.println("Tên phải bắt đầu bằng chữ hoa");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Lỗi tên chủ sở hữu không đúng");
            }
        }
        return name;
    }
}
