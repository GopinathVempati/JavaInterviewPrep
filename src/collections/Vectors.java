package collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

// Vector - DynamicArray
public class Vectors {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();
        int i = 0;
        while (i < 100) {
            vector.add(i);
            if (i % 10 == 0) {
                System.out.println("Capacity of Vector is : " + vector.capacity());
            }
            i++;
        }
        Collections.sort(vector);
        for (int in : vector) {
            System.out.println(in);
        }
        System.out.println("Final Capacity of Vector after adding reqired values are : " + vector.capacity());
    }
}
