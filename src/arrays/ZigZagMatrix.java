package arrays;

import java.util.Arrays;

public class ZigZagMatrix {
    static int[] arr = new int[]{3, 4, 6, 2, 1, 8, 9};

    public static void main(String[] args) {
        /*Every element is either greater than or less than its neighbours.
         * a < b > c */
        /*expected output : 3 6 2 4 1 9 8 */
        System.out.println(Arrays.toString(arr));
        boolean flag = true;
        for (int i = 0; i <= arr.length - 2; i++) {
            int temp;
            if (flag) { //'<' is expected
                if (arr[i] > arr[i + 1]) {
                    //swap(arr[i], arr[i + 1]);
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            } else {// '>' expected
                if (arr[i] < arr[i + 1]) {
                    //(arr[i], arr[i + 1]);
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            flag = !flag;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
