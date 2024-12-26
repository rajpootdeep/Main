package org.recursion;

public class sumOfNaturalNumWithAltSign {
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumWithAltSigns(1));
    }

    private static int sumOfNaturalNumWithAltSigns(int n) {

        if (n<1) return 0;
        if(n % 2 ==0)
            return sumOfNaturalNumWithAltSigns(n-1) - n;
        else return sumOfNaturalNumWithAltSigns(n-1) +n;
    }
}
