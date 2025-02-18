package ss21_product.view;

import ss21_product.model.ExportProducts;
import ss21_product.model.ImportedProducts;

import java.util.Scanner;

public class ExportProductView {
    protected static Scanner scanner = new Scanner(System.in);
    public static ExportProducts inputExportProduct(){
        System.out.println("Nhập tên sản phẩm");
        String name;
        while (true){
            try {
                name = scanner.nextLine();
                break;
            }catch (IllegalArgumentException illegalArgumentException){
                System.out.println("Lỗi không phải chữ! Nhập lại");
            }
        }
        System.out.println("Nhập giá sản phẩm");
        double price;
        while (true){
            try {
                price = Double.parseDouble(scanner.nextLine());
                break;
            }catch (NumberFormatException numberFormatException){
                System.out.println("Lỗi không phải là số! Vui lòng nhập lại");
            }
        }
        System.out.println("Nhập số lượng  sản phẩm");
        int quantity ;
        while (true){
            try {
                quantity =  Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException numberFormatException){
                System.out.println("Lỗi không phải là số! Vui lòng nhập lại");
            }
        }
        System.out.println("Nhập quốc gia xuất khẩu");
        String nation ;
        while (true){
            try {
                nation= scanner.nextLine();
                break;
            }catch (IllegalArgumentException illegalArgumentException){
                System.out.println("Lỗi không phải là chữ! Nhập lại");
            }
        }
        ExportProducts exportProducts = new ExportProducts(0,name,price,quantity,nation);
        return exportProducts;
    }

    public static int inputId(){
        System.out.println("Nhập id sản phẩm");
        int id;
        while (true){
            try {
                id = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException numberFormatException){
                System.out.println("Lỗi không phải là số! Nhập lại");
            }
        }
        return id;
    }
}
