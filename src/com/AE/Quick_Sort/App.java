package com.AE.Quick_Sort;

import java.util.Arrays;

/**
 * Created by Angel on 5/5/17.
 */
public class App {
    public static void main(String[] args) {
        int[]  a = {12, 81, 74, 43, 1098, 0, 8, 92, 17, 754, 912, 0, 6, 4 };
        QuickSort.QuickSort(a);
        System.out.println(Arrays.toString(a));

        int[] myArray2 = {9,8,99,110,8,87,637,8,3,13,87,12,99};
        QuickSort.QuickSort(myArray2);
        for(int i = 0;i<myArray2.length;i++){
            System.out.println(myArray2[i]);
        }
    }
}
