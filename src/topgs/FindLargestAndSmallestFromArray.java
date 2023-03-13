package topgs;

public class FindLargestAndSmallestFromArray {
    public static void main(String[] args) {
        int number[] = {83, 54, 21, 78, 46};
        int largest = number[0];
        int smallest = number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i] >  largest) {
                largest = number[i];
            } else if (number[i] < smallest) {
                smallest = number[i];

            }

        }
        System.out.println("largest " + largest);
        System.out.println("smallest  " + smallest);
    }
}
