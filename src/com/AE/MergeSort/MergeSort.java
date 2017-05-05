package com.AE.MergeSort;

/**
 * Created by Angel on 4/30/17.
 */
public class MergeSort {

    public static void mergeSort(int inputArray[]){
        mergeSort(inputArray, 0, inputArray.length - 1);
    }

    public static void mergeSort(int[] inputArray, int start, int end){
       if (end <= start ){
         return ;
       }
        int q = (start + end)/2;
        mergeSort(inputArray, start, q);// sort left half
        mergeSort(inputArray, q + 1, end); // sort right half
        merge(inputArray, start, q, end); // merge sorted results into the inputArray



    }

    public static void merge(int[] inputArray, int start, int mid, int end){
        int tempArray[] = new int[end - start + 1];

        //index counter for the left side of the array
        int leftSlot = start;
        // index counter for the right side of the array
        int rightSlot = mid+1;
        int k = 0;

        while(leftSlot <= mid && rightSlot <= end){
            if(inputArray[leftSlot] < inputArray[rightSlot]){
                tempArray[k] = inputArray[leftSlot];
                leftSlot++;
            }else{
                tempArray[k] = inputArray[rightSlot];
                rightSlot++;
            }
            k++;
        }

        // When it get's to here, that means the above loop has complete.
        // so both the right and the left side of the sub-array can be considered sorted.

        //since the right side is sorted, the left side is sorted as well
        if(leftSlot <= mid){
            while(leftSlot <= mid){
                tempArray[k] = inputArray[leftSlot];
                leftSlot++;
                k++;
            }
        }else if(rightSlot <= end){
            while(rightSlot <= end){
                tempArray[k] = inputArray[rightSlot];
                rightSlot++;
                k++;
            }
        }
        // copy over the temp array into the appropriate slots of the inputArray
        for(int i =0;i<tempArray.length;i++){
            inputArray[start + i] = tempArray[i];
        }







    }

    //still working on refactoring this one :)

//    public static int[] merge(int[] a, int p, int q, int r){
//        int left_cnt = q - p + 1;
//        int right_cnt = r - q;
//        int k = 0;
//
//        int[] L  =new int[q - p + 1];
//        int[] R = new int[r - q];
//
//        for(int i =0;i<L.length + 1;i++){
//            L[i] = a[p + i - 1];
//        }
//
//        for(int j = 0;j<R.length + 1;j++){
//            R[j] = a[q + j];
//        }
//
//        L[left_cnt + 1] = 999999999;
//        R[right_cnt + 1] = 999999999;
//
//        int i = 0;
//        int j = 0;
//
//        for(k = p;k<q;k++){
//            if(L[i] > R[j]){
//
//                a[k] = L[i];
//                i = j + 1;
//            }else{
//                a[k] = R[j];
//                j = j + 1;
//            }
//
//        }
//        return a;
//    }



}
