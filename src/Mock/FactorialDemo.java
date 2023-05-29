package Mock;

public class FactorialDemo {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            int fact = 1;
            for (int j = 1; j <= arr[i]; j++) {
               fact = fact * j;   // 1 * 1 = 1
            }
            System.out.println(" factorial of " + arr[i] +" is "+ fact);
        }
    }
}
