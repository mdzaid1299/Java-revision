package oops.hierarchicalInterface;

public class HierarchicalInterface {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.sound();
        dog.dogSound();
        cat.sound();
        cat.catSound();

    }


}
