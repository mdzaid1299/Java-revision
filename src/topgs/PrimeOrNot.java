package topgs;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("even");
        } else if (num % 2 != 0) {
            System.out.println("odd");
        }
    }
}
