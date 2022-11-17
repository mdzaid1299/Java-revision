package arraypackage.vvimp;
//kadane's algorithm time complexity is O(N)
// by using brute force approach we have to use 2 for loop and the time complexity is O(N2) --
// we have to find every possible subarray then we have to perform their sum.
public class FindTheContiguousSubArray {
    public static void main(String[] args) {
    FindTheContiguousSubArray findTheContiguousSubArray = new FindTheContiguousSubArray();
    int[] arr = {5,-4,-2,6,-1};
    int[] arr2 = {-5,4,6,-3,4,-1};
    int maxSum = findTheContiguousSubArray.findMaxInASubArray(arr);
    System.out.println("maxSum = " + maxSum);
    int maxSum2 = findTheContiguousSubArray.findMaxInASubArray(arr2);
    System.out.println("maxSum2 = " + maxSum2);
      int[] arr3 =  {-1,-2,-3,-4};
        int maxSum3 = findTheContiguousSubArray.findMaxInASubArray(arr3);
        System.out.println("maxSum3 = " + maxSum3);

    }
    public int findMaxInASubArray(int arr[]){
        //int maxSum = 0;
       // int maxSum = Integer.MIN_VALUE;

        int maxSum = arr[0];
        int currentSum = 0;

        for(int i = 0 ; i < arr.length; i++){
            currentSum = currentSum + arr[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;

            }
        }
        return maxSum;
    }
}
