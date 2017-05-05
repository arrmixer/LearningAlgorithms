package com.AE;

import com.AE.Binary_Search.BinarySearch;
import com.AE.Recursion.Recursion;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(a.length/2);
        System.out.println(BinarySearch.binarySearch(a,5));
        System.out.println(BinarySearch.recursiveBinarySearch(a, 0, 10, 5));
        System.out.println(BinarySearch.binarySearch(new int[] {1,2,3,4,7,9,12,18}, 18));
        System.out.println(BinarySearch.recursiveBinarySearch(new int[] {1,2,3,4,7,9,12,18},0,7, 99));
        System.out.println("========");
        Recursion.reducByOne(10);
        System.out.println(Recursion.recursiveLinearSearch(a, 5, 9));



        for (int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
