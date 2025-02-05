package Animal.view;


import Animal.model.Animal;

import java.util.AbstractList;
import java.util.List;
import java.util.Scanner;

public class AnimalView {
    private static Scanner scanner = new Scanner(System.in);

    public static Animal inputAnimal() {
        System.out.println("----nhập id-----");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("----nhập tên----");
        String name = scanner.nextLine();
        Animal animal = new Animal(id, name);
        return animal;
    }

    public static String inputName() {
        System.out.println("-----nhập tên-------");
        String name = scanner.nextLine();
        return name;
    }

    public static void displaySearchAnimals(List<Animal> listAnimal) {
        if (listAnimal.size() > 0) {
            for (int i = 0; i < listAnimal.size(); i++) {
                System.out.println(listAnimal.get(i).toString());
            }
        } else {
            System.out.println("Không có tên trong danh sách");
        }
    }
}
