package org.DSA.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] ar = {1, 5, 3, 7, 4, 3, 4};
        int n = ar.length;
        int c=0;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (ar[j - 1] > ar[j]) {
                    int t = ar[j];
                    ar[j] = ar[j - 1];
                    ar[j - 1] = t;
                    c++;
                }
                if(c==0) break; // optimised
                else c=0;
            }
        }
        System.out.println(c);
        for(int a:ar){
            System.out.print(a+" ");
        }
    }
}
