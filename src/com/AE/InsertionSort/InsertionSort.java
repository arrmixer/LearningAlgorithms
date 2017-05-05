package com.AE.InsertionSort;

/**
 * Created by Angel on 4/28/17.
 */
public class InsertionSort {
    public static int[] insertionSort(int[] a){
        for(int i =1;i<a.length;i++){
            int j = i -1;//points to the index position of the last value in the sorted area
            int element = a[i]; //contains the value we intend on bringing over
            while(j>=0 && a[j] > element){ //go down the array as long as the element value is greater than the current index value and j is greater than 0
               a[j+1] = a[j]; //swapped the the indexes the greater value replaces the smaller one
               j--;//go down to the next index position
            }
            a[j+1] = element;// replace/insert the element to it's correct index position
        }
        return a;//return the sorted array
    }

    public static void main(String[] args) {
        int[] a = {13,14, 2, 5, 7, 95, 47, 100, 120, 1};
        int[] myArray = {9,8,3,13,87,12,99};
        int[] myArray2 = {9,8,99,110,8,87,637,8,3,13,87,12,99};
        InsertionSort.insertionSort(a);
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("=====");
        insertionSort(myArray);
        for(int i =0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
        System.out.println("=====");
        insertionSort(myArray2);
        for(int i =0;i<myArray2.length;i++){
            System.out.println(myArray2[i]);
        }
    }
}
