package ss21_product.view;

import ss20_case_study.controller.EmployeeController;
import ss21_product.controller.ExportedProductsController;
import ss21_product.controller.ImportedProductsController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExportedProductsController exportedProductsController = new ExportedProductsController();
        ImportedProductsController importedProductsController = new ImportedProductsController();
        while (true) {
            System.out.println("Quản lý sản phẩm" +
                    "\n 1. Quản lý sản phẩm xuất khẩu" +
                    "\n 2. Quản lý sản phẩm nhập khẩu" +
                    "\n 3. Thoát");
            System.out.println("Chọn chức năng");
            int choose;
            while (true) {
                try {
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Lỗi không phải số! vui lòng chọn lại chức năng");
                }
            }
            if (choose > 3 || choose < 1) {
                System.out.println("Vui lòng chọn lại chức năng hợp lý");
            }
            switch (choose) {
                case 1:
                    exportedProductsController.displayManageImportProduct();
                    break;
                case 2:
                    importedProductsController.displayManageImportProduct();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
