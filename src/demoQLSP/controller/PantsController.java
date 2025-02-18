package demoQLSP.controller;

import demoQLSP.model.Pants;
import demoQLSP.service.PantsService;
import demoQLSP.view.PantsView;

import java.util.List;
import java.util.Scanner;

public class PantsController {
    Scanner scanner = new Scanner(System.in);
    PantsService pantsService = new PantsService();
    public void displayPants(){
        boolean flag = true;
        while (flag){
            System.out.println("Quản lý sản phẩm(--Quần--)" +
                    "\n 1. Hiển thị" +
                    "\n 2. Thêm" +
                    "\n 3. Chỉnh sửa" +
                    "\n 4. Xóa" +
                    "\n 5. Tìm kiếm" +
                    "\n 6. Quay lại menu chính");
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    List<Pants> list = pantsService.getPants();
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                    break;
                case 2:
                     pantsService.addPants(PantsView.inputPants());
                     pantsService.getPants();
                     break;
                case 3:
                    String name = PantsView.inputName();
                    boolean checkEdit = false;
                    List<Pants> pants = pantsService.getPants();
                    for (int i = 0; i < pants.size(); i++) {
                        if (pants.get(i).getName().equals(name)){
                            checkEdit=true;
                            pantsService.editPants(name,PantsView.inputPants());
                            break;
                        }
                    }
                    if (checkEdit){
                        System.out.println("Chỉnh sửa thành công");
                    }else {
                        System.out.println("Không tìm thấy tên cần chỉnh sửa");
                    }
                    break;
                case 4:
                    boolean checkDelete = pantsService.deletePants(PantsView.inputName());
                    if (checkDelete){
                        System.out.println("Xóa thành công");
                    }else {
                        System.out.println("Không tìm thấy tên cần xóa");
                    }
                    break;
                case 5:
                   List<Pants> pantsList= pantsService.searchPants(PantsView.inputName());
                    for (int i = 0; i < pantsList.size(); i++) {
                        System.out.println(pantsList.get(i));
                    }
                    break;
                case 6:
                    flag=false;
            }
        }
    }

}
