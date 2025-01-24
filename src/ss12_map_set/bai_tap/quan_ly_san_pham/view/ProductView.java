package ss12_map_set.bai_tap.quan_ly_san_pham.view;

import ss12_map_set.bai_tap.quan_ly_san_pham.model.Phone;

import java.util.Scanner;

public class ProductView {
    public static Scanner scanner = new Scanner(System.in);


    public static Phone inputPhone() {
        System.out.println("Nhập id sản phẩm:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm:");
        String name = scanner.nextLine();
        System.out.println("Nhập giá thành sản phẩm:");
        int price = Integer.parseInt(scanner.nextLine());
        Phone phone = new Phone(id, name, price);
        return phone;
    }

    public static Phone inputPhoneEdit() {
        System.out.println("Nhập tên mới của sản phẩm:");
        String name = scanner.nextLine();
        System.out.println("Nhập giá mới của thành sản phẩm:");
        int price = Integer.parseInt(scanner.nextLine());
        Phone phone = new Phone(name, price);
        return phone;
    }

    public static String inputNameProduct() {
        System.out.println("Nhập tên sản phẩm cần tìm kiếm:");
        String name = scanner.nextLine();
        return name;
    }

    public static int inputIdProductEdit() {
        System.out.println("Nhập id sản phẩm cần chỉnh sửa:");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public static int inputIdProductDelete() {
        System.out.println("Nhập id sản phẩm cần xóa:");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

}
