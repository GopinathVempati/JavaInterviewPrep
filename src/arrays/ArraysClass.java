package arrays;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        String[] array = new String[500];
        /*String[] -> Data Type
         * array    -> Variable Name
         * new String[500] -> Size of array*/

        int[] intArr = new int[5];//4*5 = 20B
        int[] arr = new int[]{3,7,1,60};
        int[] b = Arrays.copyOf(arr,arr.length);
        /*int size is 4B
        An empty arry with 0's will be initialized using 20B of memory
        * --|---|---|---|----|
        * 0 | 0 | 0 | 0 | 0  |
        * --|---|---|---|----|
        * */
        intArr[0] = 1;
        intArr[1] = 99;
        intArr[2] = 55;
        intArr[3] = 725;
        intArr[4] = 743;
        Arrays.sort(intArr);
        System.out.println(Arrays.binarySearch(intArr,743));
//        System.out.println(Arrays.toString(intArr));
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        for (int i : intArr) {
//            System.out.println(i);
//        }
       /* int[] filleArr = new int[100];
        Arrays.fill(filleArr,0,90,4);
        System.out.println(Arrays.toString(filleArr));*/
    }
}
