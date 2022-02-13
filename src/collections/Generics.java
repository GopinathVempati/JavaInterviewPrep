package collections;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        /*List list = new ArrayList();
        list.add("Gopi");
        list.add(5);
        int i = Integer.parseInt(list.get(1).toString());
        int j = Integer.parseInt(list.get(0).toString());
        System.out.println(i);
        System.out.println(j);*/

        Container<Integer> integerContainer = new Container<>();
        integerContainer.value = 8;

        Container<Double> doubleContainer = new Container<>();
        doubleContainer.value = 8.0;
    }
}

class Container<T extends Number> {// T -> Defines Type
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show() {
        System.out.println(value.getClass().getName());
    }
}
