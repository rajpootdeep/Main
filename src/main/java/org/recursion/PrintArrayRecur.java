package org.recursion;

public class PrintArrayRecur {
    public static void main(String[] args) {
        int[] ar={0};
        printArrayRecursively(ar,0);
//        int max=printMaxValueOfArr(ar);

    }
   /* private static int printMaxValueOfArr(int[] ar) {

    }*/

    private static void printArrayRecursively(int[] ar, int i) {
        if (i>=ar.length) return;
        System.out.println(ar[i]);
        printArrayRecursively(ar,++i);
    }

}
