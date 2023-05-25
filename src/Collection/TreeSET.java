package Collection;

import java.util.TreeSet;

public class TreeSET {
    public static void main(String[] args) {
        TreeSet<Integer> oddNum = new TreeSet<>();
        oddNum.add(65);
        oddNum.add(74);
//        oddNum.add(12);
        System.out.println(oddNum);
        System.out.println("oddNum = " + oddNum.first());
        System.out.println("oddNum.last( = " + oddNum.last());
        System.out.println("oddNum.pollFirst() = " + oddNum.pollFirst());
        System.out.println("oddNum.pollLast() = " + oddNum.pollLast());
        System.out.println("oddNum = " + oddNum);
    }

}
