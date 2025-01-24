package Animal.controller;

import Animal.model.Animal;
import Animal.service.AnimalService;
import Animal.view.AnimalView;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalController {
    private Scanner scanner = new Scanner(System.in);
    AnimalService animalService = new AnimalService();


    public void displayMenu() {

        while (true) {
            System.out.println("-----chọn chức năng------" +
                    "\n 1.Hiển thị" +
                    "\n 2.Thêm" +
                    "\n 3.Xóa" +
                    "\n 4.Tìm kiếm" +
                    "\n 5.Thoát");
            System.out.println("-------chọn chức năng---------");
            int count = Integer.parseInt(scanner.nextLine());
            switch (count) {
                case 1:
                    animalService.getAll();
                    break;
                case 2:
                    Animal animal = AnimalView.inputAnimal();
                    animalService.addStudent(animal);
                    break;
                case 3:
                    String name = AnimalView.inputName();
                    boolean check = animalService.deleteAnimal(name);
                    if (check) {
                        System.out.println("--xóa thành công--");
                    } else {
                        System.out.println("---không tìm thấy tên---");
                    }
                    break;
                case 4:
                    String nameSearch = AnimalView.inputName();
                    ArrayList<Animal> list = animalService.search(nameSearch);
                    AnimalView.searchAnimal(list);
                    break;
                case 5:
                    break;
            }
        }
    }
}
