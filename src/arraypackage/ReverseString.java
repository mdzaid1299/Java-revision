package arraypackage;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println("reverseString = " + reverseString.reverse("Hello"));
    }
    // Hello ----- 0lleH

    public String reverse(String str){
        String response = "";
//        char lastChar = str.charAt(str.length());
        for (int i = 0; i < str.length(); i++) {
            char lastChar = str.charAt(i);
            response = lastChar + response;
            lastChar--;
        }
        return response;
    }
}

