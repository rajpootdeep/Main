package org.immutable;

public class Strings {

    public static void main(String[] args) {
        String a="Deep";
        String b="Deep";
        String c= a;  //a==b==c==true
        String d=new String("Deep");
        StringBuilder sba= new StringBuilder("Deep");



        System.out.println(d.equals(a));
    }

}
