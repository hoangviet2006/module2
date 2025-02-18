package ss21_product.controller;

import ss20_case_study.model.Facility;
import ss21_product.model.ExportProducts;
import ss21_product.model.ImportedProducts;
import ss21_product.service.ExportProductsService;
import ss21_product.view.ExportProductView;
import ss21_product.view.ImportProductView;

import java.nio.channels.FileLock;
import java.util.List;
import java.util.Scanner;

public class ExportedProductsController {
    protected static Scanner scanner = new Scanner(System.in);
    protected ExportProductsService exportProductsService = new ExportProductsService();

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
                    List<ExportProducts> list = exportProductsService.getExportProducts();
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                    break;
                case 2:
                    exportProductsService.addExportProducts(ExportProductView.inputExportProduct());
                    exportProductsService.getExportProducts();
                    break;
                case 3:
                    int id = ExportProductView.inputId();
                    List<ExportProducts> importedProductsList = exportProductsService.getExportProducts();
                    boolean checkEdit = false;
                    for (int i = 0; i < importedProductsList.size(); i++) {
                        if (importedProductsList.get(i).getId() == id) {
                            checkEdit = true;
                            exportProductsService.editExportProducts(id, ExportProductView.inputExportProduct());
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
                    boolean checkDelete = exportProductsService.deleteExportProducts(ExportProductView.inputId());
                    if (checkDelete) {
                        System.out.println("Xóa thành công");
                    } else {
                        System.out.println("Không tìm thấy id cần xóa");
                    }
                    break;
                case 5:
                    List<ExportProducts> exportProductsList = exportProductsService.searchExportProducts(ExportProductView.inputId());
                    for (int i = 0; i < exportProductsList.size(); i++) {
                        System.out.println(exportProductsList.get(i));
                    }
                    break;
                case 6:
                    flag = false;
            }
        }

    }
}
