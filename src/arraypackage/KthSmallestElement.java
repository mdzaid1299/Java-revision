package arraypackage;

import java.util.Arrays;
import java.util.Scanner;

/*
Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given
array is 7.
 */
public class KthSmallestElement {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size = sc.nextInt();

    int[] arr = new int[size];

    for(int i = 0; i< size; i++){
        System.out.println("Enter " + i +"th element value ");
        arr[i] = sc.nextInt();
    }

        KthSmallestElement obj = new KthSmallestElement();
        System.out.println("Smallest element is  " + obj.returnKthElementOfAnArray(arr));

    }
    public int returnKthElementOfAnArray(int[] arr){
        int min = arr[0];
        for(int i = 1 ; i < arr.length; i ++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
      // find min th element--->>

        return min;
    }

}
