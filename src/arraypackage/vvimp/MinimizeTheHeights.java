package arraypackage.vvimp;

import java.util.Arrays;
import java.util.Iterator;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.util.Arrays.sort;

public class MinimizeTheHeights {
    public static void main(String[] args) {
        int[] arr = {1, 15, 10};
        int[] arr2 =  {1, 5, 15, 10};
        MinimizeTheHeights minimizeTheHeights = new MinimizeTheHeights();
        int minDiff = minimizeTheHeights.getMinimumDifference(arr, arr.length, 6);
        int minDiff2 = minimizeTheHeights.getMinimumDifference(arr2,arr2.length,3);

        System.out.println("minDiff = " + minDiff);
        System.out.println("minDiff2 = " + minDiff2);

    }
    public int getMinimumDifference(int[] arr,int size, int k ){
        sort(arr);
        int initiallyMaxHeight = arr[size-1];
        int initiallyMinHeight = arr[0];
        int answer = initiallyMaxHeight - initiallyMinHeight;
        for (int i = 1; i < arr.length; i++) {
            initiallyMinHeight = min(arr[0] + k,arr[i] - k);
            initiallyMaxHeight = max(arr[i-1] + k , arr[size-1] -k);
            answer = min(answer,initiallyMaxHeight-initiallyMinHeight);
        }
        return answer;
    }
}
