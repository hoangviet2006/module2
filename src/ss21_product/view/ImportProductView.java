package ss21_product.view;

import ss21_product.model.ImportedProducts;

import java.util.Scanner;

public class ImportProductView {
    protected static Scanner scanner = new Scanner(System.in);

    public static ImportedProducts inputImportProduct() {
        System.out.println("Nhập tên sản phẩm");
        String name;
        while (true) {
            try {
                name = scanner.nextLine();
                break;
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Lỗi không phải chữ! Nhập lại");
            }
        }
        System.out.println("Nhập giá sản phẩm");
        double price;
        while (true) {
            try {
                price = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Lỗi không phải là số! Vui lòng nhập lại");
            }
        }
        System.out.println("Nhập số lượng  sản phẩm");
        int quantity;
        while (true) {
            try {
                quantity = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Lỗi không phải là số! Vui lòng nhập lại");
            }
        }
        System.out.println("Nhập thuế nhập khẩu (%)");
        int importTax;
        while (true) {
            try {
                importTax = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Lỗi không phải là số! Nhập lại");
            }
        }
        ImportedProducts importedProducts = new ImportedProducts(0, name, price, quantity, importTax);
        return importedProducts;
    }

    public static int inputId() {
        System.out.println("Nhập id sản phẩm");
        int id;
        while (true) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Lỗi không phải là số! Nhập lại");
            }
        }
        return id;
    }
}
