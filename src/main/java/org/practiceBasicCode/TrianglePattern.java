package org.practiceBasicCode;

public class TrianglePattern {
    public static void main(String[] args) {
        TrianglePattern.printPattern(5);
    }
    private static void printPattern(int n){

        for (int i = 1; i <= n; i++) {
            for(int t=n;t>=i;t--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
