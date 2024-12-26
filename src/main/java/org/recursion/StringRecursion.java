package org.recursion;

public class StringRecursion {
    public static void main(String[] args) {
        String s = reverseString("Deep", 0);
        System.out.println(s);

    }

    private static String reverseString(String name, int i) {
        if (i > name.length() - 1) return "";
        String ss = name.substring(i, i + 1);
        String t = reverseString(name, ++i);
        ss = t + ss;
        return ss;
    }
}
