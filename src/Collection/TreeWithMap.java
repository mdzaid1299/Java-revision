package Collection;

import OverRide.Employee;
import com.sun.source.tree.Tree;

import java.util.*;

public class TreeWithMap {
    public static void main(String[] args) {
        List<String> emp = Arrays.asList("Y","B", "E" ,"X", "A" );
        Collections.sort(emp);
        for (String name : emp) {
            System.out.println(name);
        }
    }
}
