package arrays;

import java.util.Arrays;

public class SegregetePositiveNegativeVals {
    public static void main(String[] args) {
        int[] array = new int[]{-1, -4, -18, -3, 5, -7, 15, 7, 9, -2};
        int pIndex = 0;

        // each time we find a negative number, `pIndex` is incremented,
        // and that element would be placed before the pivot
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0)    // pivot is 0
            {
                swap(array, i, pIndex);
                pIndex++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
