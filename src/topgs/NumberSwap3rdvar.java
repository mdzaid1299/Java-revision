package topgs;

public class NumberSwap3rdvar {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        System.out.println("before Swaping " + " a = " + a + " b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swaping " + "a = " + a + " b = " + b);
    }
}
