package ExceptionHandling;

public class NumberFormatExp {
    public static void convertStringToString() {
        String string = "JAVA";
        try {
            int data = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            System.out.println("exception = " + e);
        }
    }

    public static void main(String[] args) {

        NumberFormatExp.convertStringToString();
    }

}
