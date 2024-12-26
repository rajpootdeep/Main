package org.recursion;

public class ReverseString {
    public static void main(String[] args) {
        String s=getRev("Deep");
        System.out.println(s);
    }

    private static String getRev(String deep) {
        if(deep==null || deep.isEmpty()) return deep;
//        String s= String.valueOf(deep.charAt(deep.length()-1));
//        s=s+getRev(deep.substring(0,deep.length()-1));
        //return s;
        return deep.charAt(deep.length()-1)+getRev(deep.substring(0,deep.length()-1));

    }
}
