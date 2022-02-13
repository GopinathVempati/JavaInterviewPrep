package arrays;

public class SpiralTwoDArr {
    public static void main(String[] args) {
        /*o/p - 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10*/
        int[][] twoDArr =
                new int[][]{{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
        int rows = twoDArr.length;
        int cols = twoDArr[0].length;
        printSpiral(rows, cols, twoDArr);
    }

    private static void printSpiral(int rows, int cols, int[][] twoDArr) {
        int i, k = 0, l = 0; // i- iteration for loop; k - row(manipulation); l - column (manipulation)
        int last_row = rows - 1, last_col = cols - 1;
        while (k <= last_row && l <= last_col) {
            for (i = l; i <= last_col; i++) {
                System.out.print(twoDArr[k][i] +" ");
            }
            k++;
            for (i = k; i <= last_row; i++) {
                System.out.print(twoDArr[i][last_col]+ " ");
            }
            last_col--;
            if (k <= last_row) {
                for (i = last_col; i >= l; i--) {
                    System.out.print(twoDArr[last_row][i]+" ");
                }
                last_row--;
            }
            if (l <= last_col) {
                for(i = last_row; i>= k; i--){
                    System.out.print(twoDArr[i][l]+" ");
                }
                l++;
            }
        }
    }
}
