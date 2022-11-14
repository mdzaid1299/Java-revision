package arraypackage;

import java.util.HashSet;

public class UnionOfTwoArray {
    public static void main(String[] args) {

        UnionOfTwoArray unionOfTwoArray = new UnionOfTwoArray();
        int arr1[] = {4,2,1,8};
        int[] arr2 = {2,5,6,1};

        System.out.println("After union of two array ");
        System.out.println(unionOfTwoArray.findUnion(arr1, arr2));



    }
    public HashSet<Integer> findUnion(int[] arr1, int[] arr2){

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <arr1.length ; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i <arr2.length ; i++) {
            set.add(arr2[i]);
        }
//        return set.size(); // output = 6
        return set;
    }
}
