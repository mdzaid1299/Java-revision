package arraypackage;
/*
Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4

=======================
Input:
N = 8
A[] = {9, 8, 7, 6, 4, 2, 1, 3}
Output:
3 9 8 7 6 4 2 1
 */
public class CyclicallyRotateAnArray {
    public static void main(String[] args) {

        CyclicallyRotateAnArray cyclicallyRotateAnArray = new CyclicallyRotateAnArray();
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {9, 8, 7, 6, 4, 2, 1, 3};
        System.out.println("Odd rotation");
        cyclicallyRotateAnArray.rotate(arr, 5);
        System.out.println();
        System.out.println();
        System.out.println("Even rotation");
        cyclicallyRotateAnArray.rotate(arr2,8);
    }
    public void rotate(int[] arr, int size){
        int temp=arr[size-1];
        for(int i = size-1; i > 0 ; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] =  temp;
        for (int i = 0 ; i < size ; i++){
          System.out.print(arr[i]+ " ");
       }
    }
    }



//        int temp;
//        if(size % 2 == 0) {
//               temp = arr[0];
//               arr[0] = arr[size-1];
//            //   arr[size-1] = arr[size-2];
//        }else {
//            int anotherTemp = arr[0];
//            System.out.println("anotherTemp = " + anotherTemp);
//            temp = arr[size-1];
//            System.out.println("temp = " + temp);
//            arr[0] = temp;
//            arr[size-1] = anotherTemp;
//        }
//        for (int i = 0 ; i < size ; i++){
//            System.out.print(arr[i]+ " ");
//        }
////    }
//}
