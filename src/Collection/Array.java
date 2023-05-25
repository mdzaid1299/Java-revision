package Collection;

import java.util.*;
import java.util.Enumeration;
import java.util.List;

public class Array  {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
