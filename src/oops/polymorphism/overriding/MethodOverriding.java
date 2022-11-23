package oops.polymorphism.overriding;

public class MethodOverriding {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Car car = new Car();
        car.engine(7);
        bike.engine(4);
    }
}
