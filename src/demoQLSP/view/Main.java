package demoQLSP.view;

import demoQLSP.controller.PantsController;
import demoQLSP.controller.ShirtController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PantsController pantsController = new PantsController();
        ShirtController shirtController = new ShirtController();
        while (true) {
            System.out.println("Quản lý sản phẩm" +
                    "\n 1. Quản lý sản phẩm (Áo)" +
                    "\n 2. Quản lý sản phẩm (Quần)" +
                    "\n 3. Thoát");
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    shirtController.displayPants();
                    break;
                case 2:
                    pantsController.displayPants();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
