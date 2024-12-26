package org.recursion;

public class SumOfDisgitsAndPower {

    public static void main(String[] args) {
//        System.out.println(sumOfDigits(670));
        System.out.println(powerof(2,3));
    }

    private static int powerof(int x, int y) {
        if(y<=1) return x;
        return  x * powerof(x,y-1);
    }

    private static int sumOfDigits(int i) {
        if (i <= 0) return 0;
        int j = i % 10 + sumOfDigits(i / 10);
        return j;
    }

}
