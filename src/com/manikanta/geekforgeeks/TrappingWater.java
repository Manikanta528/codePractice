package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1?page=2&sortBy=submissions

public class TrappingWater {
    public static void main(String[] args) {
        int arr[] = {7,4,0,9};
        int n = arr.length;
        long ans = trappingWater(arr, n);
        System.out.println(ans);
    }
    static public long trappingWater(int arr[], int n){
        long water = 0;
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];
        int maxleft = arr[0];
        int maxright = arr[n-1];
        for (int i = 0; i < n; i++) {
            if(maxleft < arr[i]) maxleft = arr[i];
            leftmax[i] = maxleft;
        }
        for (int i = n-1; i >= 0; i--) {
            if (maxright < arr[i]) maxright = arr[i];
            rightmax[i] = maxright;
        }
        for (int i = 0; i < n; i++) {
            int tm = Integer.min(leftmax[i],rightmax[i]);
            water += tm - arr[i];
        }
        return water;
    }
}
