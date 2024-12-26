package org.DSA.Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={6,3,1,5,4};
        quickSort(arr,0,arr.length-1);
        for (int a:arr){
            System.out.print(a+"  ");
        }
    }
   static int  partition(int[] arr,int st,int end){

        int pivot=arr[st];
        int count=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<=pivot)
                count++;
        }
        int pivotIndex=st+count;
        swap(arr,st,pivotIndex);
        // keep all small elements before pivot and bigger after pivot
        int i=st,j=end;
        while(i<pivotIndex && j>pivotIndex){
            while (arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;

            if(i< pivotIndex && j>pivotIndex){
                swap(arr,i,j);
                i++;j--;
            }
        }


        return pivotIndex;  // return current pivot index
   }
    static void swap(int[] arr,int x, int y){
        int temp =arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static void quickSort(int[] arr,int st,int end){
        if(st>=end) return;

        int pi=partition(arr,st,end);
        quickSort(arr,st,pi-1);
        quickSort(arr,pi+1,end);
    }
}
