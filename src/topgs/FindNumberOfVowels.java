package topgs;

public class FindNumberOfVowels {
    public static void main(String[] args) {
        int count = 0;
        char[] arr = {'a', 'e', 'y', 'u', 'i', 'd'};
        System.out.println("vovel count");
        FindNumberOfVowels find = new FindNumberOfVowels();
        int finder = find.countVovel(arr);
        System.out.println(finder);
    }


    public  int countVovel(char[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            char c = arr[i];
            if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A')) {
                count++;
            }
        }
        return count;
    }
}
