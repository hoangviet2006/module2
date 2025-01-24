package Animal.service;

import Animal.model.Animal;

import java.util.ArrayList;

public class AnimalService implements IAnimal {

    private static ArrayList<Animal> arrayList = new ArrayList<>();

    static {
        arrayList.add(new Animal(1, "Việt"));
        arrayList.add(new Animal(2, "Đạt"));
        arrayList.add(new Animal(3, "Vi"));
        arrayList.add(new Animal(4, "Đức"));
    }

    @Override
    public ArrayList<Animal> getAll() {
        return arrayList;
    }


    @Override
    public void addStudent(Animal animal) {
        arrayList.add(animal);
    }


    @Override
    public boolean deleteAnimal(String name) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getName().equals(name)) {
                arrayList.remove(i);
                return true;
            }
        }
        return false;

    }

    @Override
    public ArrayList<Animal> search(String name) {
        ArrayList<Animal> animals =new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
           if (arrayList.get(i).getName().toLowerCase().contains(name.toLowerCase())){
               animals.add(arrayList.get(i));
           }
        }
        return animals;
    }
}
