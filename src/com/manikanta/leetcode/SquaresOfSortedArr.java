package com.manikanta.leetcode;

public class SquaresOfSortedArr {
    public static void main(String[] args) {
        int nums[] = {-4,-1,0,3,10};
        int ans[] = sortedSquares(nums);
        for(int i : ans){
            System.out.print(i+" ");
        }
    }

    private static int[] sortedSquares(int[] nums) {
        // long p = 0;
        // for(int i= 0; i < nums.length ; i++){
        //     p = nums[i];
        //     nums[i] = (int)(p*p);
        // }
        // Arrays.sort(nums);
        // return nums;
        int len = nums.length;
        int s = 0 , e = len-1;

        int ans[] = new int[len];
        for(int i = len -1 ; i >= 0; i--){
            if(Math.abs(nums[s]) > Math.abs(nums[e])){
                ans[i] = nums[s]*nums[s];
                s++;
            }else{
                ans[i] = nums[e]*nums[e];
                e--;
            }
        }
        return ans;
    }
}
