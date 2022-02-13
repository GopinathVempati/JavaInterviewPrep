package arrays;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");
        arrayList.add("Five");
        System.out.println(arrayList.contains("Three"));
        System.out.println(arrayList.indexOf("Four"));
        System.out.println(arrayList.lastIndexOf("One"));
        System.out.println(arrayList.subList(1,3));
    }
}
