package oops.polymorphism.overriding;

public class Bike extends Car{
    @Override
    public void engine(int numberOfGear) {

        System.out.println("number Of Gear in bike = " + numberOfGear);
    }

}
