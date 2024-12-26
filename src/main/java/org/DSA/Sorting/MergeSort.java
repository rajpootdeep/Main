package org.DSA.Sorting;

public class MergeSort {
    public static void main(String[] args) {
    int[] arr={3,6,9,3,1};
    mergeSort( arr,0,arr.length-1);
        for(int a:arr) System.out.print(a+"  ");
    }
    static void mergeSort(int[] arr,int l, int r){
        if(l>=r) return ;
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    static  void merge(int [] arr,int l, int m, int r){
        int n1=m-l+1;
        int n2=r-m;
        int[] left=new int[n1];
        int[] right=new int[n2];
        for(int i=0;i<n1;i++) left[i]=arr[l+i];
        for(int i=0;i<n2;i++) right[i]=arr[m+1+i];
        int i=0,j=0,k=l;
        while(i< n1 && j< n2){
            if(left[i]<=right[j]) {
                arr[k]=left[i];
                k++;i++;
            }else {
                arr[k]=right[j];
                k++;j++;
            }
        }

        while(i<n1){
            arr[k]=left[i];
            i++;k++;
        }
        while(j<n2){
            arr[k]=right[j];
            k++;j++;
        }
    }
}
