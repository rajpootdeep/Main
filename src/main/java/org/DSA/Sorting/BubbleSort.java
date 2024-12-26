package org.DSA.Sorting;

public class BubbleSort {

    public static void main(String[] args) {

//        int[] ar = {1, 5, 7, 2, 7, 3};
        int[] ar = {1,2,6,4,5,3};
        int n = ar.length;
        boolean flag=false;
        int c=0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    int t = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = t;
                    flag=true;
                    c++;
                }
            }
            if (flag != true) break; // optimised best case
            else flag=false;
        }
        System.out.println("Swapping " +
                "" +
                "" +
                ".Count : "+c);
        for(int a:ar){
            System.out.print(a+" ");
        }
    }
}
