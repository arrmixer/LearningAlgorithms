package com.AE.Quick_Sort;

/**
 * Created by Angel on 5/5/17.
 */
public class QuickSort {
    //overide to allow only one parameter
    public static void quickSort(int A[]){
        quickSort(A, 0, A.length - 1);
    }
// p is the start and r is the end of the array
    public static void quickSort(int A[], int p, int r){

        if(p<r){
           int q = partition(A, p, r); //
            quickSort(A, p, q - 1); // sorts the left side
            quickSort(A, q + 1, r); // sorts the right side
        }


    }

    public static int partition(int[] A, int p, int r){
        int x = A[r]; // the pivot position
        int i = p - 1;

        for(int j = p;j<r;j++){
            if(A[j] <= x)
            {
                i++;
                //swapping the values
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;

            }
        }

        int temp = A[i + 1];
        A[i + 1] = A[r];
        A[r] = temp;

        return i + 1;

    }


}
