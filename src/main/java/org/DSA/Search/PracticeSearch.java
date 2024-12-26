package org.DSA.Search;

public class PracticeSearch {
    public static void main(String[] args) {
        int[] arr = {0, 2, 2, 3, 3, 5, 6, 6, 6, 7};
        int target = 6;
        int i = firstOccurenceUsingBinarySearch(arr, target);
        int j = lastOccurance(arr, target);
        System.out.println(i + "  :   " + j);
//        System.out.println(sqrRootOfNonNegativeValue(60));
    }

    private static int firstOccurenceUsingBinarySearch(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        int i = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                i = mid;
            }
            if (target <= arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return i;
    }


    private static int sqrRootOfNonNegativeValue(int n) {
        int l = 0, r = n;
        int ans = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            int val = mid * mid;
            if (val == n) return mid;
            else if (n < val) {
                r = mid - 1;
//                    ans=r;
            } else {
                l = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    private static int lastOccurance(int[] arr, int target) {
        int ind = -1;
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target)
                ind = mid;
            if (target >= arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ind;
    }


}

