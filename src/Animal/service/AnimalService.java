package Animal.service;

import Animal.model.Animal;
import Animal.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalService implements IAnimal {
    private final String ANIMAL_FILE = "D:\\codegym\\module2\\src\\Animal\\data\\student.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;

    @Override
    public List<Animal> getAll() {
        List<Animal> animalList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(ANIMAL_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Animal animal = new Animal(Integer.parseInt(array[0]),array[1]);
            animalList.add(animal);
        }
        return animalList;
    }


    @Override
    public void addAnimal(Animal animal) {
        List<String> stringList = new ArrayList<>();
        stringList.add(animal.getInforToFile());
        ReadAndWriteFile.writeFile(ANIMAL_FILE, stringList,APPEND);
    }


    @Override
    public boolean deleteAnimal(String name) {
        List<Animal> animalList = getAll();
        boolean check = false;
        for (int i = 0; i < animalList.size(); i++) {
            if (name.equals(animalList.get(i).getName())) {
                check = true;
                animalList.remove(i);
                break;
            }
        }
        if (check) {
            List<String> stringList = new ArrayList<>();
            for (Animal animal : animalList) {
                stringList.add(animal.getInforToFile());
            }
            ReadAndWriteFile.writeFile(ANIMAL_FILE,stringList,NOT_APPEND );
        }
        return check;
    }


    @Override
    public List<Animal> search(String name) {
        List<Animal> arrayList = getAll();
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getName().toLowerCase().contains(name.toLowerCase())) {
                animals.add(arrayList.get(i));
            }
        }
        return animals;
    }

}
