package sets;

import java.util.*;

public class HashSets {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(70);
//        System.out.println(set.size());
//        System.out.println(set.contains(50));
//        System.out.println(set.remove(50));

        for (Integer integer : set) {
            // System.out.println(integer);
        }
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
//        System.out.println(set.removeAll(list));
        set.retainAll(list);
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
