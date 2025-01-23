package org.example;

import javax.sound.midi.Soundbank;
import java.util.HashSet;
import java.util.Set;

public class XPheno {

    public static void main(String[] args) {

        String s="abcdeeff";
        String lS="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String ts=s.substring(i,j);
                if(isNotContainsDuplicateChar(ts)){
                    if(lS.length()<ts.length())
                        lS=ts;
                }
            }
        }

        System.out.println("Longest String : "+lS);

    }


   public static boolean isNotContainsDuplicateChar(String ss){

       Set<Character> set=new HashSet<>();

       for(int i=0;i<ss.length();i++){
           if(!set.add(ss.charAt(i))){
               return false;
           }
       }
        return true;

    }


}
