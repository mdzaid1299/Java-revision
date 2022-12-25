package ArraysHusb;

public class Bubble {
    public static void main(String[] args) {
        int[] a = {78, 85, 34, 75};
        int temp ;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; i < a.length - 1 -i; i++) {
                if (a[j] > a[j + 1]) {
                  temp = a [j];
                    a[j] = a[j + 1];
                    a [j + 1 ] = temp;
                }
            } System.out.println(a);

        }
    }
}
