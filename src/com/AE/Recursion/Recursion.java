package com.AE.Recursion;

/**
 * Created by Angel on 4/26/17.
 */
public class Recursion {

    public static void reducByOne(int n){

        if (n >= 0) { //Base Case
            reducByOne(n-1);
        }

        System.out.println("Completed Call: " + n);

    }

    public static int recursiveLinearSearch(int[] a, int i, int x){

        int n = a.length - 1;

            if (i > n){
                return -1;
            }
            else if(a[i] == x) {
                return i;
            }
            else {
                System.out.println("index at: " + i);
                return recursiveLinearSearch(a, i + 1, x);
            }

    }


}
