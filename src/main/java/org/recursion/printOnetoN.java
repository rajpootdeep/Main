package org.recursion;

public class printOnetoN {

    public static void main(String[] ar){
        printall(4);
    }

    static void printall(int n){
        if(n<0) return;

        printall(n-1);
        System.out.println(n);
    }
}
