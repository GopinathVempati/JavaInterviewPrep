package exception;

import java.util.Scanner;

public class JavaExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        try {
            System.out.println(num1/num2);
            int[] num = new int[]{3,5,7,8};
            int a = num[6];
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException received");
        }
    }
}
