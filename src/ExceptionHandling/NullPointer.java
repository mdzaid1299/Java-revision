package ExceptionHandling;

public class NullPointer {
    public static void main(String[] args) {
        try {
            int num1 = 0;
            int num2 = 20 / num1;
        } catch (NullPointerException e) {
            System.out.println("Divide by zero error");
        }finally {
            System.out.println("finnally block");
        }
        System.out.println("will get printed");
    }
}
