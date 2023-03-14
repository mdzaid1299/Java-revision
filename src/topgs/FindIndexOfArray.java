package topgs;

import java.util.Scanner;

public class FindIndexOfArray {
    public static void main(String[] args) {
        int[] array = {8, 44, 2323, 66, 78, 2, 76};
        System.out.println("enter the element you want index of");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int index = findIndex(array, target);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("index of " + target + " in array is " + index);
        }
    }

    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return 1;
            }

        }
        return   -1;
    }


}
