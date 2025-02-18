package demoQLSP.view;

import demoQLSP.model.Pants;

import java.util.Scanner;

public class PantsView {
    private static Scanner scanner = new Scanner(System.in);

    public static Pants inputPants(){
        System.out.println("Nhập tên quần");
        String name = scanner.nextLine();
        System.out.println("Nhập giá thành");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập hãng sản phẩm");
        String brand = scanner.nextLine();
        System.out.println("Nhập size quần");
        int size = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chất liệu của quần");
        String material  = scanner.nextLine();
        Pants pants = new Pants(0,name,price,brand,size,material);
        return pants;
    }
    public static String inputName(){
        System.out.println("Nhập id sản phẩm");
        String name = scanner.nextLine();
        return name;
    }
}
