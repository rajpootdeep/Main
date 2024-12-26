package org.recursion;

public class fibonacci {
    private static int n1 = 0, n2 = 1, n3;

    public static void main(String[] args) {
//       printFibonacci(0,1,7);
//        printFibonacci(7);
       int h=printFibonacci((short) 4);
        System.out.println(h);
    }

    private static void printFibonacci(int i, int j, int n) {  // best way

        if (n < 1) return;
        System.out.println(i + j);
        printFibonacci(j, j + i, n - 1);
    }

    private static int printFibonacci(short n) {
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;

        if (n <=3) return n3;
        printFibonacci((short)(n-1));
        return n3;
    }

    private static void printFibonacci(int n) {
        if (n > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
            printFibonacci(n - 1);
        }
        System.out.println("int");
    }


}
