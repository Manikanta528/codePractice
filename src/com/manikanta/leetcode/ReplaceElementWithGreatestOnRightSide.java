package com.manikanta.leetcode;

class ReplaceElementWithGreatestOnRightSide {
    public static void main(String[] args) {
        int arr[] = {17,18,5,4,6,1};
        int ans[] = replaceElements(arr);
        for (int v :
                ans) {
            System.out.print(v+" ");
        }
    }
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        ans[n-1] = -1;
        int max = arr[n-1];
        for(int i = n-2 ; i >= 0 ; i--){
            ans[i] = max;
            if(max < arr[i]) max = arr[i];
        }
        return ans;

        /* //brute force
        int n = arr.length;
        int t,max;
        for(int i = 0 ; i < n-1 ; i++){
            t = arr[i];
            max = -1;
            for (int j = i+1; j < n; j++) {
                if(max < arr[j] ) max = arr[j];
            }
            arr[i] = max;
        }
        arr[n-1] = -1;
        return arr;*/
    }
}