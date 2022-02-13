package arrays;

public class DiagonalMatrix {
    public static void main(String[] args) {

        /*To print diagonals of a matrix
        * we have 'm' rows
        * we have 'n' columns
        * to know the diagonals
        * we hae a formula m+n-1
        * we have a 4 x 5 matrix m= 4; n=5; 4+5-1 = 8 diagonals*/

       /* -------------
        | a b c d e |
        | f g h i j |
        | k l m n o |
        | p q r s t |
        |-----------|4x5
                -------------
                | 00 01  02|           diagonlas are (00),(10,01)(20,11,02)(21,12)(22)
                | 10 11  12|           ex: say we take diagonal (20,11,02) if 20 i=2;  j=0
                | 20 21  22|                                     ij ij ij  if 11 i=i-1;j=j+1 (from above values)
                |-----------|3x3                                           if 02 i =i-1;j=j+1 (applied from above values)
        */
        String[][] twoDArr = new String[][]
                {{"a", "b", "c", "d", "e"},
                        {"f", "g", "h", "i", "j"},
                        {"k", "l", "m", "n", "o"},
                        {"p", "q", "r", "s", "t"},
                        {"u", "v", "w", "x", "y"}};
        int i, j, k, m = twoDArr.length, n = twoDArr[0].length;//m - rows, n - cols
        for (k = 0; k <= m - 1; k++) {
            i = k;
            j = 0;
            while (i >= 0) {
                System.out.print(twoDArr[i][j] + " ");
                i -= 1;
                j += 1;
            }
            System.out.println();
        }

        for (k = 1; k < n - 1; k++) {
            i = m - 1;
            j = k;
            while (j <= n - 1) {
                System.out.print(twoDArr[i][j] + " ");
                i -= 1;
                j += 1;
            }
            System.out.println();
        }
        System.out.println(twoDArr[m-1][n-1]);//print last rows last column value
    }
}
