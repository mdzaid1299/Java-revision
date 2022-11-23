package oops.polymorphism.superKeyword;



public class Dog extends Animal{
    boolean sleep;
    public Dog(boolean walk, int legs,boolean sleep) {
        super(walk, legs);
        this.sleep = sleep;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("super.run = " + super.run);
        System.out.println("Dogs are eating");
    }
}
