package Animal.service;

import Animal.model.Animal;

import java.util.ArrayList;
import java.util.List;

public interface IAnimal {
    List<Animal> getAll();


    void addAnimal(Animal animal);

    boolean deleteAnimal(String name);

    List<Animal> search(String name);
}
