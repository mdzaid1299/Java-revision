package oops.example.MultilevelInheritance;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        BabyDog babyDog = new BabyDog();
       // BabyDog babyDog1 = (BabyDog) new Animal();//lower to uppercasting not possible thats why it is casted into (babydog).. it generate error at run time
        Animal animal1 = new Dog();  // uppercasting to lower casting can be possible
        Dog dog1 = new BabyDog();// uppercasting to lower casting can be possible
        System.out.println("===============================");
        dog1.eat();
        dog1.bark();
        System.out.println("===============================");
        animal1.eat();
        System.out.println("===============================");
        babyDog.weep();
        babyDog.eat();
        babyDog.bark();

        System.out.println("===============================");
        dog.bark();
        dog.eat();
        System.out.println("===============================");
        animal.eat();
    }
}
