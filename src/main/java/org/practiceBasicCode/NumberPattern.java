package org.practiceBasicCode;

import java.util.ArrayList;
import java.util.List;

public class NumberPattern {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7, 9, 10, 11, 12, 19};
        int s = arr[0];
        int e = arr[0];
        List<String> ranges=new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==e+1){
                e=arr[i];
                if(i==arr.length-1) ranges.add(arrangeRanges(s,e));
            } else  {
                ranges.add(arrangeRanges(s,e));
                s=arr[i];
                e=arr[i];
                if(i==arr.length-1) ranges.add(arrangeRanges(s,e));
            }

        }
        System.out.println(ranges);
    }

    private static String arrangeRanges(int s, int e) {

        return s==e ? String.valueOf(s):String.valueOf(s)+" - "+String.valueOf(e);
    }
}
