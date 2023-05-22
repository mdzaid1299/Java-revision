package ExceptionHandling;

public class Exp {
    public static void main(String[] args) {


        int number[] = new int[8];
        try {
            for (int i = 0; i <= number.length; i++) {
                System.out.println("number[i] = " + number[i]);
            }
        } catch (ArrayIndexOutOfBoundsException obj) {
            System.out.println(obj);
        }
        System.out.println("not get printed");
    }
}
