package com.AE.Quick_Sort;

/**
 * Created by Angel on 5/5/17.
 */
public class QuickSort {

    public static void QuickSort(int A[]){
        QuickSort(A, 0, A.length - 1);
    }

    public static void QuickSort(int A[], int p, int r){

        if(p<r){
           int q = Partition(A, p, r);
            QuickSort(A, p, q - 1);
            QuickSort(A, q + 1, r);
        }


    }

    public static int Partition(int[] A, int p, int r){
        int x = A[r];
        int i = p - 1;

        for(int j = p;j<r;j++){
            if(A[j] <= x)
            {
                i++;
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
