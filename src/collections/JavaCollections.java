package collections;

import comparator.ComparatorList;

import java.util.*;

public class JavaCollections {
    public static void main(String[] args) {

       /* Collection collection = new ArrayList<>();
        collection.add(8);
        collection.add("Gopi");
        collection.add(8f);
       *//* to fetch values from Colletion there are two ways
        1.Iterator
        2.Enhanced forloop*//*
        //region Using Iterator fetching logic
        Iterator i = collection.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        //endregion

        //region Using Enhanced ForLoop
        for (Object obj : collection) {
            System.out.println(obj);
        }
        //endregion*/

        List<Integer> integerCollection = new ArrayList<>();
        integerCollection.add(476);
        integerCollection.add(452);
        integerCollection.add(668);
        integerCollection.add(943);
        integerCollection.add(1, 357);
        Collections.sort(integerCollection);
//        /*Stream API*/
//        integerCollection.forEach(System.out::println);

        Comparator<Integer> comparator = new ComparatorList();
        Collections.sort(integerCollection, comparator);
        for (int intc : integerCollection) {
            System.out.println(intc);
        }
    }
}
