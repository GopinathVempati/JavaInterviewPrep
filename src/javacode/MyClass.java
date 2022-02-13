package javacode;

public class MyClass {
    public static void main(String[] args) {
        TestClass a = new TestClass(1000);
        TestClass b = new TestClass(1000);
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}


