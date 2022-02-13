package arrays;

import java.util.Arrays;

public class WaveFrom {
    public static void main(String[] args) {
        /*Wave form concept
         * If array index is even i.e 0,2,4,6,... the next element is greater that even index i.e 3<6
         * if index is odd i.e 1,3,5,7,9.. the next element to odd index should be small i.e 6>2 */
//        int[] arr = new int[]{3, 5, 1, 2, 6, 10, 7, 9, 8};
        int[] arr = new int[]{5, 3, 12, 2, 6, 10, 7, 9, 8};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            int temp;
            if (i % 2 == 0) {
                if (!(arr[i] < arr[i + 1])) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                if (!(arr[i] > arr[i + 1])) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
