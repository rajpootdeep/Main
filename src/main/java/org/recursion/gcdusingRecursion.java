package org.recursion;

public class gcdusingRecursion {
    public static void main(String[] args) {
//        System.out.println(gcd(15,24)); // using long division method
//        System.out.println(gcdusingRecu(16,12)); //Euclids Algorithm
        /*
        * Euclids Algorithm -->> gcd(x,y) = gcd(y,x%y),  gcd(x,0)=x
        *
        * lcm * gcd=x*y , lcm=(x*y)/gcd;
        *
        * */

        System.out.println(9%6);
    }

    private static int gcdusingRecu(int x, int y) {
       if (y==0) return x;
       return gcdusingRecu(y,x%y);
    }

    private static int gcd(int x,int y) {
        while(x%y != 0){
            int j=x;
            x=y;
            y=j%y;
        }
        return y;
    }
}
