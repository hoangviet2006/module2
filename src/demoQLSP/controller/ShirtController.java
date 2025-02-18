package demoQLSP.controller;

import demoQLSP.model.Pants;
import demoQLSP.model.Shirt;
import demoQLSP.service.PantsService;
import demoQLSP.service.ShirtService;
import demoQLSP.view.PantsView;
import demoQLSP.view.ShirtView;

import java.util.List;
import java.util.Scanner;

public class ShirtController {
    Scanner scanner = new Scanner(System.in);
    ShirtService pantsService = new ShirtService();
    public void displayPants() {
        boolean flag = true;
        while (flag) {
            System.out.println("Quản lý sản phẩm(--Áo--)" +
                    "\n 1. Hiển thị" +
                    "\n 2. Thêm" +
                    "\n 3. Chỉnh sửa" +
                    "\n 4. Xóa" +
                    "\n 5. Tìm kiếm" +
                    "\n 6. Quay lại menu chính");
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    List<Shirt> list = pantsService.getShirt();
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                    break;
                case 2:
                    pantsService.addShirt(ShirtView.inputPants());
                    break;
                case 3:
                    String name = ShirtView.inputName();
                    boolean checkEdit = false;
                    List<Shirt> pants = pantsService.getShirt();
                    for (int i = 0; i < pants.size(); i++) {
                        if (pants.get(i).getName().equals(name)) {
                            checkEdit = true;
                            pantsService.editShirt(name, ShirtView.inputPants());
                            break;
                        }
                    }
                    if (checkEdit) {
                        System.out.println("Chỉnh sửa thành công");
                    } else {
                        System.out.println("Không tìm thấy tên cần chỉnh sửa");
                    }
                    break;
                case 4:
                    boolean checkDelete = pantsService.deleteShirt(PantsView.inputName());
                    if (checkDelete) {
                        System.out.println("Xóa thành công");
                    } else {
                        System.out.println("Không tìm thấy tên cần xóa");
                    }
                    break;
                case 5:
                    List<Shirt> pantsList = pantsService.searchShirt(PantsView.inputName());
                    for (int i = 0; i < pantsList.size(); i++) {
                        System.out.println(pantsList.get(i));
                    }
                    break;
                case 6:
                    flag = false;
            }
        }
    }
}
