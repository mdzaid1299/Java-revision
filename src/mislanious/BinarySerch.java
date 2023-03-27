package mislanious;

public class BinarySerch {
    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 7, 8, 9};
        int index = binarySerch(arr, 0, arr.length - 1 , 7);
        System.out.println("Index" + index);
    }

    public static int binarySerch(int[] arr, int first, int last, int key) {
        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] <= key) {
                return binarySerch( arr, mid + 1, last, key);
            } else {
                return binarySerch(arr, first, mid - 1, key);
            }

        }
        return -1;
    }
    }

