package com.AE.Linear_Search;

/**
 * Created by Angel on 4/20/17.
 */
public class Linear_Search {


    public static int linear_search(int[] a, int x){
       for(int i = 0;i<a.length;i++){
         if(a[i] == x){

             return i;
         }

       }
        System.out.println("Not in the array");
       return -1;
   }

    public static void main(String[] args) {
        int[] a = {2,3,5,6};
        Linear_Search array = new Linear_Search();

        linear_search(a, 5);
    }
}
