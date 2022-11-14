package arraypackage;

public class SortAnArray {
    public static void main(String[] args) {

        int[] arr = {2,1,0,2,1,0};
        System.out.println("After sorting");
        SortAnArray sortAnArray = new SortAnArray();

        sortAnArray.sort012(arr,6);
        for (int i = 0 ; i < arr.length; i ++){
            System.out.print(arr[i] + " ");
        }


    }
    public  void sort012(int a[], int n)
    {
        // code here
        int temp = 0;
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < i ; j++){
                if(a[i] < a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }

    }
}
