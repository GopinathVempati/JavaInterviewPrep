package comparator;

import java.util.Comparator;

public class ComparatorList implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 % 10 > o2 % 10) // ">"-- increasing order ; "<" -- Decreasing order
            return 1;//1 is swap the values (Increasing order)
        return -1;// -1 means do not swap
    }
}
