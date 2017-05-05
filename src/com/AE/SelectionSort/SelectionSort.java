package com.AE.SelectionSort;

/**
 * Created by Angel on 4/26/17.
 */
public class SelectionSort {
    public static int[] selectionSort(int a[]){
        for(int i = 0;i<a.length;i++){
            int min = i;// establish the min as the next iteration

                for(int j = i + 1;j<a.length;j++){ // check the current min with the list to see if another number is lower on the list

                   if(a[j]<a[min]){ //find a lower number
                       min = j; // find the lowest number on the list
                       //didn't have to do this lol
//                       int temp = a[j];
//                       a[j] = a[i];
//                       a[i] = temp;
                   }

                }
            int temp = a[i]; /// swap current min with the new min
            a[i] = a[min];
            a[min] = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {13,14, 2, 5, 7, 95, 47, 100, 120, 1};
        int[] myArray = selectionSort(new int[] {9,8,3,13,87,12,99});
        int[] myArray2 = {9,8,99,110,8,87,637,8,3,13,87,12,99};
        for(int i = 0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
        selectionSort(a);
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
        selectionSort(myArray2);
        for(int i = 0;i<myArray2.length;i++){
            System.out.println(myArray2[i]);
        }

    }
}
