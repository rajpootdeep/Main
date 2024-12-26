package org.recursion;

public class factorial {

    public static void main(String[] ar) {
        System.out.println(printFact(877778848));
    }

    private static long printFact(long i) {
        if (i <= 1) return 1;
        return i * printFact(i - 1);
    }
}
