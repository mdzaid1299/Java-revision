package SingleLevelInheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Udbilau udbilau = new Udbilau();
        udbilau.eat();
        udbilau.sleep();
        Bilota bilota = new Bilota();
        animal.eat();
        System.out.println(bilota.boobs);
        System.out.println(bilota.kaam);
    }
}
