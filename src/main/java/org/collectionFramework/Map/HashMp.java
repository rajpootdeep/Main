package org.collectionFramework.Map;

import java.util.HashMap;

public class HashMp {

    public static void main(String[] arg){
        int arr[] ={1,2,4,3,1,6,1};
        HashMap<Integer, Integer> mapp=new HashMap<>();
        for(int i: arr){
            if(mapp.containsKey(i)){
                mapp.put(i,mapp.getOrDefault(i,0)+1);
            }else {
                mapp.put(i,1);
            }
        }
        int freq=0,amsKey=-1;
        for(int key : mapp.keySet()){
            if(mapp.get(key) > freq){
                freq=mapp.get(key);
                amsKey=key;
            }
        }
        System.out.println(amsKey+"     :   "+freq);
    }
}
