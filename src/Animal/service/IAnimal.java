package Animal.service;

import Animal.model.Animal;

import java.util.ArrayList;

public interface IAnimal {
    ArrayList<Animal> getAll();


    void addStudent(Animal animal);

    boolean deleteAnimal(String name);

    ArrayList<Animal> search(String name);
}
