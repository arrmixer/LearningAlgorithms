package com.AE.Binary_Search;

/**
 * Created by Angel on 4/24/17.
 */
public class BinarySearch {

// make sure array is sorted
    public static int binarySearch(int[] a, int x){
        int p = 0;
        int r = a.length -1;
    // another way
//        while( p <= r) {
//            int q = (p + r) / 2;
//            if (x < a[q]) r = q - 1;
//            else if (x > a[q]) p = q + 1;
//            else return q;
//
//        }
    while(p <= r){
        int q = (p + r)/2;
        if(a[q] == x){
            return q;
        }else if(a[q]>x){
            r = q - 1;
        }else{
            p = q + 1;
        }
    }
        System.out.println("Not in the array");
        return -1;
    }

   public static int recursiveBinarySearch(int[]a, int p, int r, int x){
       System.out.println("[ " + p + "..." + r + " ]");

        if(p > r){
            return -1;
        }else{
            int q = (p + r)/2;
            if(a[q] == x){
                return q;
            }else if(a[q] > x){
                return recursiveBinarySearch(a, p, q-1, x);
            }else{
                return recursiveBinarySearch(a, q + 1,r,x);
            }
        }
   }
}
