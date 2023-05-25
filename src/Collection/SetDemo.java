package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("JOHN");
        set.add("KON?");
        System.out.println("data in set = " + set);
        System.out.println("set.contains(\"harry\") = " + set.contains("harry"));
        System.out.println("set.size( = " + set.size());
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.hasNext());
        }
    }

}
