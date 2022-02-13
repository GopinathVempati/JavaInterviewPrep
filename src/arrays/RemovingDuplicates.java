package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovingDuplicates {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 2, 3, 3, 3, 4};
       /* int j = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }
        a[j++] = a[a.length - 1];
        System.out.println(Arrays.toString(a));*/
        removeDuplicates(a, a.length);
    }

    static void removeDuplicates(int arr[], int n) {
        // To store index of next unique element
        int j = 0;

        // Doing same as done in Method 1
        // Just maintaining another updated index i.e. j
        for (int i = 0; i < n - 1; i++)
            if (arr[i] != arr[i + 1])
                arr[j++] = arr[i];

        arr[j] = arr[n - 1];
        System.out.println(Arrays.toString(arr));
    }
}
