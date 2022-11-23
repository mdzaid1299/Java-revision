package oops.polymorphism.superKeyword;

public class Animal {
    boolean walk;
    int legs;
    String run = "yes";
    public Animal(boolean walk, int legs) {
        this.walk = walk;
        this.legs = legs;
    }

    public void eat(){
        System.out.println("All animal can eat");
    }
}
