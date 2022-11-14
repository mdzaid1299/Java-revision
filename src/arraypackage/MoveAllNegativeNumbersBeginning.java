package arraypackage;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MoveAllNegativeNumbersBeginning {

    public static void main(String[] args) {
        MoveAllNegativeNumbersBeginning moveAllNegativeNumbersBeginning = new MoveAllNegativeNumbersBeginning();
        int[] arr = {-2,5,-9,5,-5,-8,0,-10,34,6};
        moveAllNegativeNumbersBeginning.moveNegativeNumber(arr);

        System.out.println("After moving");
        for(int var : arr){
            System.out.print(var + " ");
        }

    }
    public void moveNegativeNumber(int [] arr){
        Arrays.sort(arr);
    }
}
