package Exclusives;

import java.util.Scanner;

public class reverseOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scanner.nextLine();
        //using string builder
        StringBuilder builder = new StringBuilder(input);
        builder.reverse();
        String reversed = builder.toString();
        System.out.println("original- " + input);
        System.out.println("Reversed- " + reversed);
        scanner.close();
    }
}
