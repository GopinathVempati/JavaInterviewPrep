package operators;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = scanner.nextInt();
        if (x < 5) {
            System.out.println("Hello");
        } else if (x > 10 && x< 100)System.out.println("10");
        else if (x > 100) System.out.println("100");
        else System.out.println("Bye");
    }
}
