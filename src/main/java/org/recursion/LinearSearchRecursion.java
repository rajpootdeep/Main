package org.recursion;

import java.util.ArrayList;

public class LinearSearchRecursion {

    public static void main(String[] args) {
        int[] ar = {8, 4, 8, 54, 4, 7, 5, 4};
//        boolean b = findNo(ar, 0, 0);
//        System.out.println(b);

//        allIndices(ar, 0, 8);
        System.out.println(allIndices(ar, 0, 8));


    }

    private static ArrayList<Integer> allIndices(int[] ar, int i, int n) {

        if (i >= ar.length) return new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (ar[i] == n) {
            arrayList.add(i);
        }
        ArrayList<Integer> arrayList1 = allIndices(ar, ++i, n);
        arrayList.addAll(arrayList1);
        return arrayList;
    }

    private static boolean findNo(int[] ar, int i, int n) {
        if (i >= ar.length) return false;
        if (ar[i] == n) return true;
        return findNo(ar, ++i, n);
    }


}
