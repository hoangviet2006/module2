package quan_ly_thu_vien.view;

import quan_ly_thu_vien.model.Client;

import java.util.Scanner;

public class ClientView {
    public static Scanner scanner = new Scanner(System.in);

    public static Client inputClient() {
        System.out.println("Nhập tên khách hàng");
        String name;
        while (true) {
            try {
                name = scanner.nextLine();
                break;
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Lỗi không phải là chữ,Nhập lại");
            }
        }

        System.out.println("Nhập mã sách");
        String code;
        while (true) {
            try {
                code = scanner.nextLine();
                break;
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Lỗi không phải là chữ,Nhập lại");
            }
        }
        System.out.println("Nhập tên sách");
        String bookTitle;
        while (true) {
            try {
                bookTitle = scanner.nextLine();
                break;
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Lỗi không phải là chữ,Nhập lại");
            }
        }
        System.out.println("Nhập số lượng");
        int quantity;
        while (true) {
            try {
                quantity = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Lỗi không phải là số,Nhập lại");
            }
        }
        Client client = new Client(name, code, bookTitle, quantity);
        return client;
    }

    public static String InputBookTitle() {
        System.out.println("Nhập tên sách");
        String bookTitle;
        while (true) {
            try {
                bookTitle = scanner.nextLine();
                break;
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Lỗi không phải là chữ,Nhập lại");
            }
        }
        return bookTitle;
    }
}
