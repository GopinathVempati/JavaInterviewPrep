package arrays;

import java.util.Arrays;

public class DutchNationalFlagProblem {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 1, 2, 2, 2, 2, 1, 1, 1, 0, 2, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0 -> {
                    swap(low, mid, arr);
                    low++;
                    mid++;
                }
                case 1 -> mid++;
                case 2 -> {
                    swap(mid, high, arr);
                    high--;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
