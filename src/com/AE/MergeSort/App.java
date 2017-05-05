package com.AE.MergeSort;

/**
 * Created by Angel on 5/2/17.
 */
public class App {
    public static void main(String[] args) {
        int[] a = {13,14, 2, 5, 7, 95, 47, 100, 120, 1};
        int[] myArray = {9,8,3,13,87,12,99};
        int[] myArray2 = {9,8,99,110,8,87,637,8,3,13,87,12,99};
        MergeSort.mergeSort(a);
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
        MergeSort.mergeSort(myArray);
        for(int i = 0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
        MergeSort.mergeSort(myArray2);
        for(int i = 0;i<myArray2.length;i++){
            System.out.println(myArray2[i]);
        }

    }
}
