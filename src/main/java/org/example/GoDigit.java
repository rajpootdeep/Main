package org.example;

import java.util.HashMap;
import java.util.Map;

public class GoDigit {

    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"Deep");
        hashMap.put(2,"Bhashkar");

        for(Map.Entry<Integer,String> entry: hashMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        hashMap.forEach((k,v) -> System.out.println(k+" "+v));

    }
}