package demoQLSP.view;

import demoQLSP.model.Pants;
import demoQLSP.model.Shirt;

import java.util.Scanner;

public class ShirtView {
    private static Scanner scanner = new Scanner(System.in);

    public static Shirt inputPants(){
        System.out.println("Nhập tên áo");
        String name = scanner.nextLine();
        System.out.println("Nhập giá thành");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập hãng sản phẩm");
        String brand = scanner.nextLine();
        System.out.println("Nhập size áo");
        int size = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập màu của áo");
        String color  = scanner.nextLine();
        Shirt pants = new Shirt(0,name,price,brand,size,color);
        return pants;
    }
    public static String inputName(){
        System.out.println("Nhập tên áo");
        String name = scanner.nextLine();
        return name;
    }
}
