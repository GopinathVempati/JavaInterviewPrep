package operators;

public class BooleanOperators {
    public static void main(String[] args) {
        boolean a = true, b = false;
        boolean xora = true, xorb = true;
        System.out.println(a || b);
        System.out.println(a && b);
        System.out.println(a && !b);
        System.out.println(a ^ !b);
        System.out.println(a ^ b);
        System.out.println(xora^xorb);
    }
}
