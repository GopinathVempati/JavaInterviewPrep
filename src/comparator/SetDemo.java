package comparator;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args){
        Set<Integer> set = new TreeSet<>();
        set.add(9);
        set.add(91);
        set.add(934);
        set.add(922);
        set.add(639);
        set.add(926);
        for (int s : set){
            System.out.println(s);
        }
    }
}
