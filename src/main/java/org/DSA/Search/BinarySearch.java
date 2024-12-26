package org.DSA.Search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,0,4,5,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

//        int target=5;
////        boolean b=binarySearch(arr,target);
//        boolean b=binarySearchRecursive(arr,0,arr.length-1,target);
//        System.out.println(b);
    }
    static boolean binarySearch(int[] a,int target){// time - O(log n)
        int n=a.length;
        int st=0,end=n-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(target==a[mid]) return true;
            else if (target> a[mid]) {
                st=mid+1;
            } else  {
                end=mid-1;
            }
        }
        return false;
    }


    static boolean binarySearchRecursive(int[] a,int st,int end,int t){
        if (st>end) return false;
        int mid=(st+end)/2;
        if (a[mid]==t) return true;
        else if (t>a[mid]) {
            return binarySearchRecursive(a,mid+1,end,t);
        }else {
           return  binarySearchRecursive(a,st,mid-1,t);
        }
    }


    //mid=st+(end-st)/2   -> save from exceed int size
}
