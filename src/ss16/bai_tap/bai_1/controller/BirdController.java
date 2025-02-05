package ss16.bai_tap.bai_1.controller;

import ss16.bai_tap.bai_1.model.Bird;
import ss16.bai_tap.bai_1.service.BirdService;
import ss16.bai_tap.bai_1.service.IBird;
import ss16.bai_tap.bai_1.view.BirdView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BirdController {
    public static Scanner scanner = new Scanner(System.in);
    public static BirdService birdService = new BirdService();

    public void disPlay() {
        while (true) {
            System.out.println("Chọn Chức Năng" +
                    "\n 1. Hiển Thị" +
                    "\n 2. Thêm" +
                    "\n 3. Xóa" +
                    "\n 4. Tìm Kiếm" +
                    "\n 5. Chỉnh Sửa" +
                    "\n 6. Thoát");
            System.out.println("Chọn Chức Năng");
            int count;
            while (true) {
                try {
                    count = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException exception) {
                    System.out.println("Lỗi chọn chức năng phải là số trong bảng");
                }
            }
            switch (count) {
                case 1:
                    List<Bird> birds = birdService.getBird();
                    for (int i = 0; i < birds.size(); i++) {
                        System.out.println(birds.get(i));
                    }
                    break;
                case 2:
                    Bird bird = BirdView.inputBird();
                    birdService.addBird(bird);
                    break;
                case 3:
                    String inputName = BirdView.inputName();
                    boolean check = birdService.deleteBird(inputName);
                    if (check) {
                        System.out.println(" Xóa thành công");
                    } else {
                        System.out.println(" Không tìm thấy tên");
                    }
                    break;
                case 4:
                    String nameSearch = BirdView.inputName();
                    List<Bird> list = birdService.SearchBird(nameSearch);
                    BirdView.displaySearchAnimals(list);
                    break;
                case 5:
                    String name = BirdView.inputNameEdit();
                    Bird birdEdit = BirdView.inputBird();
                    boolean checkEdit = birdService.editBird(name,birdEdit);
                    if (checkEdit){
                        System.out.println("Chỉnh sửa thành công");
                    }else {
                        System.out.println("Không tìm thấy tên cần chỉnh sửa");
                    }
                    break;
            }
        }
    }
}
