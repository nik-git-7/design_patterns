package variant.strategy;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        dog.run();
        cat.makeSound();
        cat.run();

        Animal animal;
        int animalChoice = new Random().nextInt(2);

        switch (animalChoice) {
            case 0:
                animal = new Dog();
                break;
            case 1:
                animal = new Cat();
                break;
            default:
                return;
        }
        animal.makeSound();
        animal.run();
    }
}
