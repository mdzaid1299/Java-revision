package methodOverloading;

public class Son extends Father {
    @Override
    public void print() {
        System.out.println("i am son");
    }
    public static void main(String[] args) {
        GrandFather grandFather = new GrandFather();
        grandFather.print();
        Father father = new Father();
        father.print();
        Son son = new Son();
        son.print();
    }
}
