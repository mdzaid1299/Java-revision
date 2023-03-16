package String;

public class Imutable {
    public static void main(String[] args) {
        String str = "Hi";
        String str2 = "HI";
        if (str == str2) {
            System.out.println("true");
        }else System.out.println("false");
    }
}
