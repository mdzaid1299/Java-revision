package Exception;

public class Throw {
    public static void checkNum(int num) {
        if (num < 1) {
            throw new ArithmeticException("Number is negative");
        } else {
            System.out.println("Square of " + num + "is" + (num * num));

        }
    }

    public static void main(String[] args) {
        checkNum(9);
        System.out.println("ok number");
    }
}
