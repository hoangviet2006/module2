package thi_module.view;

import quan_ly_thu_vien.controller.BookController;
import quan_ly_thu_vien.controller.ClientController;
import thi_module.controller.PayMentAccountController;
import thi_module.controller.SavingAccountController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayMentAccountController payMentAccountController = new PayMentAccountController();
        SavingAccountController savingAccountController = new SavingAccountController();
        while (true) {
            System.out.println("Chọn Chức Năng" +
                    "\n 1. Quản Lý  tài khoản tiêu dùng" +
                    "\n 2. Quản Lý tài khoản tiết kiệm" +
                    "\n 3. Thoát");
            System.out.println("Chọn  chức năng");
            int count;
            while (true) {
                try {
                    count = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Lỗi không phải là số,Nhập lại");
                }
            }
            switch (count) {
                case 1:
                    payMentAccountController.displayPayment();
                    break;
                case 2:
                    savingAccountController.displaySaving();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

}
