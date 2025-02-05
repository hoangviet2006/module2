package quan_ly_thu_vien.view;

import quan_ly_thu_vien.controller.BookController;
import quan_ly_thu_vien.controller.ClientController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookController bookController = new BookController();
        ClientController controller = new ClientController();
        while (true) {
            System.out.println("Chọn Chức Năng" +
                    "\n 1. Quản Lý  sách" +
                    "\n 2. Quản Lý Khách hàng" +
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
                    bookController.display();
                    break;
                case 2:
                    controller.display();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
