package Animal.controller;

import Animal.model.Animal;
import Animal.service.AnimalService;
import Animal.view.AnimalView;

import java.util.ArrayList;
import java.util.List;
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
                    List<Animal> animalList = animalService.getAll();
                    for (int i = 0; i < animalList.size(); i++) {
                        System.out.println(animalList.get(i));
                    }
                    break;
                case 2:
                    Animal animal = AnimalView.inputAnimal();
                    animalService.addAnimal(animal);
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
                    List<Animal> list = animalService.search(nameSearch);
                    AnimalView.displaySearchAnimals(list);
                    break;
                case 5:
                    break;
            }
        }
    }
}
