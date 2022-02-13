package arrays;

public class MultiDimenArray {
    public static void main(String[] args) {
        int[][] twoD = new int[4][5];
        int[][] arr2D = new int[][]{{10, 30, 40, 50,60}, {60, 70, 80, 90}, {100, 110, 120, 130}, {140, 150, 160, 170}};
        twoD[0][0] = 0;
        twoD[0][1] = 10;
        twoD[0][2] = 20;
        twoD[0][3] = 30;
        twoD[0][4] = 40;
        twoD[1][4] = 50;

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
