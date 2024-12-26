package org.DSA.Sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] ar={2,5,7,3,2,5,3,2};
        int n=ar.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(ar[i]>ar[j]){
                    int t=ar[i];
                    ar[i]=ar[j];
                    ar[j]=t;
                }
            }
        }
        for(int a :ar){
            System.out.print(a+" ");
        }

    }

}
