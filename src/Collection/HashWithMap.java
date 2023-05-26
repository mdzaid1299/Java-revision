package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashWithMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(101, "Jamu");
        hashMap.put(102, "kalu");
        hashMap.put(103, "lalu");
        System.out.println(hashMap);
        System.out.println("Does contain 102?" + hashMap.containsKey(102));
        System.out.println("does contain value kalu" + hashMap.containsValue("kalu"));
    }
}