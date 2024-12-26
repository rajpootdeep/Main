package org.practiceBasicCode;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Stream;

public class NthNearestPalindromeNumber {
    public static void main(String[] args) {
//        int a = nearestPalindromeN(45);
        int b=nThNearestPalindrome(45,5);
        int c=nThNearestPalindromeWithMinDifference(45,5);
        System.out.println(b);
    }

    /*
    * difference of distance is nearest
    * distance ke hisab se pachwa nearest
    *
    * Main question of Delloite
    * */
    private static int nThNearestPalindromeWithMinDifference(int n, int t) {
        LinkedList<Integer> lowerPalindrome = new LinkedList<>();
        LinkedList<Integer> higherPalindrome = new LinkedList<>();
        int lower = n - 1;
        int higher = n + 1;
        while (lowerPalindrome.size() + higherPalindrome.size() < 5) {
            if (lower > 9 && lowerPalindrome.size() < 5) {
                if (isPalindrome(lower)) lowerPalindrome.add(lower);
                lower--;
            }

            if (higherPalindrome.size() < 5) {
                if(isPalindrome(higher)) higherPalindrome.add(higher);
                higher++;
            }


        }

        Comparator<Integer> comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1-n) - Math.abs(o2-n) <0)
                    return -1;
                else if (Math.abs(o1-n) -Math.abs(o2-n)== 0) {
                    if(o1>=o2) return 0;
                    else return 1;
                }else {
                    return 1;
                }

            }
        };

       int a= Stream.concat(higherPalindrome.stream(),lowerPalindrome.stream()).sorted(comparator).skip(4).findFirst().get();

        System.out.println(lowerPalindrome+" "+higherPalindrome);

return a;


    }

    /*
    * Nearest of 5th ( Pachwa ka nearest)
    * */
    private static int nThNearestPalindrome(int n, int t) {
        int left=n-1;
        int c=t;
        int L=Integer.MAX_VALUE;
        while( c>0 && left>9){

            if(isPlaindrome(String.valueOf(left))){
                c--;
                L=left;
                System.out.println(" loop L "+left);
            }
            left--;
        }
        System.out.println(" Left "+left+" L : "+L);

        int right =n;
        c=t;
        int R=0;
        while(c>0){
            right++;
            if(isPlaindrome(String.valueOf(right))){
                c--;
                R=right;
                System.out.println(" loop R "+right);
            }
        }
        System.out.println("Right "+ right+" R : "+R);
        if (Math.abs(n - L) == Math.abs(n - R)) {
            return L <= R ? right : left;
        } else if (Math.abs(n - L) < Math.abs(n - R)) {
            return L;
        } else return R;


    }


    private static int nearestPalindromeN(int n) {
        int left = n - 1;
        while (isPlaindrome(String.valueOf(left)) == false) {
            left--;
        }

        int right = n + 1;
        while (isPlaindrome(String.valueOf(right)) == false) {
            right++;
        }


        if (Math.abs(n - left) == Math.abs(n - right)) {
            return left <= right ? right : left;
        } else if (Math.abs(n - left) < Math.abs(n - right)) {
            return left;
        } else return right;


    }

    private static boolean isPlaindrome(String s) {
        int l = 0;
        int right = s.length() - 1;
        while (l < right) {
            if (s.charAt(l) != s.charAt(right)) return false;
            l++;
            right--;
        }
        return true;
    }
    private static boolean isPalindrome(int n) {
        int t = n;
        int r = 0;
        while (n > 0) {
            int x = n % 10;
            r = r * 10 + x;
            n = n / 10;
        }
        if (t == r) return true;
        return false;
    }
}
