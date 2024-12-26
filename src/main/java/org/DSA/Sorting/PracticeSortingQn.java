package org.DSA.Sorting;

public class PracticeSortingQn {
    public static void main(String[] args) {

        //Move all zero to end of array, while maintaining relative order of the non-zero

        /*int[] ar = {2, 5, 0, 4, 0};
        int n = ar.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (ar[j] != 0 && ar[j - 1] == 0) {
                    int t = ar[j - 1];
                    ar[j - 1] = ar[j];
                    ar[j] = t;
                }
            }
        }
        for (int a : ar) {
            System.out.print(a + " ");
        }
*/

        //Given an  array of names fruits;sort it in lexicographical order using insertion sort
       /* String[] fr = {"Mango", "Apple", "Banana", "Orange"};
        int n = fr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (fr[j - 1].compareToIgnoreCase(fr[j]) > 0) {
                    String t = fr[j];
                    fr[j] = fr[j - 1];
                    fr[j - 1] = t;
                }
            }
        }
        for (String a : fr) {
            System.out.print(a + "   ");
        }*/

//        System.out.println("Ram".compareToIgnoreCase("God"));

        //

    }
}
