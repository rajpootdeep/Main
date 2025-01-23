package org.example;

import java.util.Arrays;
import java.util.Map;

public class PeerslandL2 {

    /*
     * 2 Arrays of integers unsorted, merge into third array sorted. Programming logic. Array1 = {1,4,7,7,9,10,-38}, Array2 = {5,8,3,26,-38,95,37,8,8,9,9}
     *
     * */
    public static void main(String[] args) {

        int[] ar1 = {1, 4, 7, 7, 9, 10, -38};
        int[] ar2 = {5, 8, 3, 26, -38, 95, 37, 8, 8, 9, 9};

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        int[] ar3 = new int[ar1.length + ar2.length];
        int i = 0, j = 0, k = 0;
        while (i < ar1.length && j < ar2.length) {
            if (ar1[i] < ar2[j]) {
                ar3[k] = ar1[i];
                i++;
                k++;
            }else {
                ar3[k]=ar2[j];
                j++;
                k++;
            }
        }
        while(i<ar1.length){
            ar3[k]=ar1[i];
            i++;
            k++;
        }

        while(j<ar2.length){
            ar3[k]=ar2[j];
            j++;k++;
        }

    }
}