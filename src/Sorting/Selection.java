package Sorting;

public class Selection {
    public static void main(String[] args) {
        int arr[] = {7, 6, 9, 3, 2};

        for (int i = 0; i < arr.length -1; i++) {
            int smaller = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smaller] > arr[j]) {
                    smaller = j;
                }

            }
            int temp = arr[smaller];
            arr[smaller] = arr[i];
            arr[i] = temp;
        }
    }

}
