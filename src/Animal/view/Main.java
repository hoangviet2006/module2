package Animal.view;

import Animal.controller.AnimalController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnimalController animalController = new AnimalController();
        animalController.displayMenu();
    }
}
