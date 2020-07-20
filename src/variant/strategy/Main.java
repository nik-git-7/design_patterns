package variant.strategy;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        dog.run();
        cat.makeSound();
        cat.run();
    }
}
