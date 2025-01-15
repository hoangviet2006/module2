package ss7_abstract_interface.thuc_hanh;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].makeSound());
            if (animals[i] instanceof Chicken) {
                Edible edible = (Chicken) animals[i];
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i].howToEat());
        }

    }
}
