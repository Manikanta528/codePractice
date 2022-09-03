package com.manikanta.leetcode;

//https://leetcode.com/problems/count-good-triplets/

public class CountGoodTriplets {
    public static void main(String[] args) {
        int arr[] = {3,0,1,1,9,7};
        int a = 7, b = 2, c = 3;
        int ans = countGoodTriplets(arr, a, b, c);
        System.out.println(ans);
    }
    public static int countGoodTriplets(int[] arr, int a, int b, int c){
        int count = 0,len = arr.length;

        for (int i = 0; i < len-2; i++) {
            for (int j = i+1; j < len-1; j++) {
                if(Math.abs(arr[i] - arr[j]) <= a){
                    for (int k = j+1; k < len; k++) {
                        if(Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[k] - arr[i]) <= c){
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }
}
