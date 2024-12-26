package org.recursion;

public class FrogJump {


    public static void main(String[] args) {
        int n = 4;
        int[] arr = {10, 30, 40, 20};

        int j = minCost(arr, n, 0);
        System.out.println(j);
    }

    private static int minCost(int[] arr, int n, int i) {
        if(i == n-1) return 0;
    int opt1=minCost(arr,n,i+1)+ Math.abs(arr[i]-arr[i+1]);
    if(i>=n-2) return opt1;
    int opt2=minCost(arr,n,i+2)+Math.abs(arr[i]-arr[i+2]);
    return Math.min(opt1,opt2);

    }


}
