package Exception;

public class Throws {
    public static double divide (int m , int n ) throws ArithmeticException {
        int  div = m / n;
        return div;
    }

    public static void main(String[] args) {
        try {
            System.out.println(divide(80, 0));
        } catch (ArithmeticException e) {
            System.out.println("number not divied by 0");

        }
        System.out.println("Rest of code");
    }

}
