package ss21_product.controller;

import ss21_product.model.ImportedProducts;
import ss21_product.service.ExportProductsService;
import ss21_product.service.ImportedProductsService;
import ss21_product.view.ImportProductView;

import java.util.List;
import java.util.Scanner;

public class ImportedProductsController {
    protected static Scanner scanner = new Scanner(System.in);
    protected static ImportedProductsService importedProductsService = new ImportedProductsService();

    public void displayManageImportProduct() {
        boolean flag = true;
        while (flag) {
            System.out.println("Quản lý hàng xuất khẩu" +
                    "\n 1. Hiển thị" +
                    "\n 2. Thêm" +
                    "\n 3. Sửa" +
                    "\n 4. Xóa" +
                    "\n 5. Tìm kiếm" +
                    "\n 6. Quay lại menu chính");
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
            if (choose > 6 || choose < 1) {
                System.out.println("Vui lòng chọn lại chức năng hợp lý");
            }
            switch (choose) {
                case 1:
                    List<ImportedProducts> list = importedProductsService.getImportedProducts();
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                    break;
                case 2:
                    importedProductsService.addImportedProducts(ImportProductView.inputImportProduct());
                    importedProductsService.getImportedProducts();
                    break;
                case 3:
                    int id = ImportProductView.inputId();
                    List<ImportedProducts> importedProductsList = importedProductsService.getImportedProducts();
                    boolean checkEdit = false;
                    for (int i = 0; i < importedProductsList.size(); i++) {
                        if (importedProductsList.get(i).getId() == id) {
                            checkEdit = true;
                            importedProductsService.editImportedProducts(id, ImportProductView.inputImportProduct());
                            break;
                        }
                    }
                    if (checkEdit) {
                        System.out.println("Chỉnh sửa thành công");
                    } else {
                        System.out.println("Không tìm thấy id cần chỉnh sửa");
                    }
                    break;
                case 4:
                    boolean checkDelete = importedProductsService.deleteImportedProducts(ImportProductView.inputId());
                    if (checkDelete) {
                        System.out.println("Xóa thành công");
                    } else {
                        System.out.println("Không tìm thấy id cần xóa");
                    }
                    break;
                case 5:
                    List<ImportedProducts> importedProducts = importedProductsService.searchImportedProducts(ImportProductView.inputId());
                    for (int i = 0; i < importedProducts.size(); i++) {
                        System.out.println(importedProducts.get(i));
                    }
                    break;
                case 6:
                    flag = false;
            }
        }

    }
}
