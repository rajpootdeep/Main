package org.example;
//String str = "pwwkeo" wkeo ans tring length -->4
//A longest sub string which you can get from a given string with repating character
import java.util.HashMap;
import java.util.HashSet;

public class PeersIsLand{



    public static void main(String[] args){

        String ss=longestSubstring("pwwkeo");
        System.out.println(ss+" "+ss.length());

    }

    static String longestSubstring(String s){

        String lSubString="";


        for(int i=0;i<=s.length()-1;i++){
            for(int j=i+1;j<=s.length();j++){

                String temp=s.substring(i,j);
                if(isContainsDuplicateChars(temp)){
                    if(temp.length() > lSubString.length())
                        lSubString=temp;
                }

            }
        }

        return lSubString;
    }

    static boolean isContainsDuplicateChars(String str){

        HashSet<Character> set=new HashSet<>();

        for(char a: str.toCharArray()){
            if(!set.add(a)){
                return false;
            }
        }
        return true;



       /* HashMap<Character,Integer> hm=new HashMap<>();

        for(char a:str.toCharArray()){
            if(hm.containsKey(a)){
                hm.put(a,hm.get(a)+1);
            }
            hm.put(a,1);
        }

        for(char i:hm.keySet()){
            if(hm.get(i)>1) return false;
        }

        return true;*/
    }
}