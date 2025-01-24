package ss12_map_set.bai_tap.quan_ly_san_pham.controller;

import ss12_map_set.bai_tap.quan_ly_san_pham.model.Phone;
import ss12_map_set.bai_tap.quan_ly_san_pham.service.ProductService;
import ss12_map_set.bai_tap.quan_ly_san_pham.view.ProductView;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneController {
    public static Scanner scanner = new Scanner(System.in);
    ProductService productService = new ProductService();

    public void display() {
        while (true) {
            System.out.println("--------Chọn Chức Năng--------" +
                    "\n 1. Hiển thị" +
                    "\n 2. Thêm " +
                    "\n 3. Chỉnh Sửa" +
                    "\n 4. Xóa" +
                    "\n 5. Tìm kiếm" +
                    "\n 6. Thoát");
            System.out.println("------Chọn Chức Năng--------");
            int count = Integer.parseInt(scanner.nextLine());
            switch (count) {
                case 1:
                    productService.getAll();
                    break;
                case 2:
                    Phone phone = ProductView.inputPhone();
                    productService.add(phone);
                    break;
                case 3:
                    int id = ProductView.inputIdProductEdit();
                    boolean checkId = productService.checkId(id);
                    if (checkId) {
                        Phone newPhone = ProductView.inputPhoneEdit();
                        productService.editProduct(id, newPhone);
                        System.out.println("Chỉnh sửa thành công");
                    } else {
                        System.out.println("Không tìm thấy id cần chỉnh sửa");
                    }
                    break;
                case 4:
                    int idDelete = ProductView.inputIdProductDelete();
                    boolean checkIdDelete = productService.deleteProduct(idDelete);
                    if (checkIdDelete) {
                        System.out.println("Xóa thành công");
                    } else {
                        System.out.println(" Không tìm thấy id muốn xóa");
                    }
                    break;
                case 5:
                    String nameSearch = ProductView.inputNameProduct();
                    ArrayList<Phone> phones = productService.searchProduct(nameSearch);
                    if (phones.size()>0){
                        System.out.println(phones);
                    }else {
                        System.out.println("Không tìm thấy tên sản phẩm");
                    }
                    break;
                default:
                    System.exit(0);
            }
        }
    }

}
