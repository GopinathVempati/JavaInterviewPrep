package loops;

public class NestedLoops {
    public static void main(String[] args) {
        /*Loop with in a loop is nested loop*/
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

        /*Example 1*/
        /*WAP multiplication tables from 1 to 10*/
        for (int table = 1; table < 11; table++) {
            System.out.print(table + " table ");
            for (int digit = 1; digit < 11; digit++) {
                System.out.print(table * digit + ", ");
            }
            System.out.println();
        }

        /*Example 2*/
        /*WAP to print pattern (pyramids)
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5*/
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*Example 3*/
        /*WAP to print pattern right-angled triangle
         *           *
         *         * *
         *       * * *
         *   * * * * *
         * * * * * * *
         * Written conventional code directly by trail and error*/
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5; j++) {
                if (i > j)
                    System.out.print(" ");
                else System.out.print("*"); // giving space of * gives pyramid System.out.print("* ")
            }
            System.out.println();
        }
        /*OR
        * Printing spaces first and then *'s later */
        int n = 20;
        for (int i = 0; i <= n; i++) {
            int noOfSpaces = n - i;
            for (int j = 0; j <= noOfSpaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");// giving space of * gives pyramid System.out.print("* ")
            }
            System.out.println();
        }

        /*WAP to print inverted pyramid*/
        int m = 20;
        for (int i = 0; i <= m; i++) {
            int noOfSpaces = i - 1;
            for (int j = 0; j <= noOfSpaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= m - i + 1; k++) {
                System.out.print("* ");// giving space of * gives pyramid System.out.print("* ")
            }
            System.out.println();
        }
    }
}
