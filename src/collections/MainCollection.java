package collections;

import java.util.Scanner;

public class MainCollection {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = s.nextInt();
        }

        int negativeVal = 0;
        for (int i = 0; i < num; i++) {
            int sum = 0;
            System.out.println("outer loop position -> "+i);
            System.out.println("Sum is -> "+sum);
            for (int j = i; j < num; j++) {
                sum = arr[j] + sum;
                if (sum < 0)
                    negativeVal++;
                System.out.println("inner loop position -> "+j);
            }
        }
        System.out.println();
        System.out.println(negativeVal);
    }
}
