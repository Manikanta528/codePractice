package com.manikanta.leetcode;

//https://leetcode.com/problems/sum-of-all-odd-length-subarrays/

import java.util.Arrays;


public class SumOfAllOddLengthSubarrays {
    public static void main(String[] args) {
        int arr[] = {1,4,2,5,3};
        int ans = sumOddLengthSubarrays(arr);
        System.out.println(ans);
    }

    private static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int preSum [] = new int[arr.length];
        int actSum = arr[0];
        preSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = preSum[i-1]+arr[i];
            preSum[i] = sum;
            actSum += arr[i];
        }
//        System.out.println(actSum);
//        System.out.println(Arrays.toString(preSum));
        int k = 3;
        while(k <= arr.length){
            for (int i = k-1; i < arr.length; i++) {
                if(i == k-1){
                    actSum += preSum[i];
                }else{
                    actSum += preSum[i] - preSum[i-k];
                }
            }
            k+=2;
        }

        return actSum;
    }
}
