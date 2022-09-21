package com.manikanta.leetcode;

//https://leetcode.com/problems/sum-of-even-numbers-after-queries/

import java.util.Arrays;

public class SumOfEvenNumbersAfterQueries {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int queries[][] = {{1,0},{-3,1},{-4,0},{2,3}};
        int arr[] = sumEvenAfterQueries(nums, queries);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries){
        int arr[] = new int[queries.length];
        int sumEven = 0,p = 0;
        for(int i : nums){
            if(i%2 == 0){
                sumEven += i;
            }
        }
        for(int i = 0 ; i < queries.length ; i++){
            if(nums[queries[i][1]]%2 == 0){
                sumEven -= nums[queries[i][1]];
            }
            nums[queries[i][1]] += queries[i][0];
            if(nums[queries[i][1]]%2 == 0){
                sumEven += nums[queries[i][1]] ;
            }
            arr[i] = sumEven;
        }
        return arr;

    }
}
