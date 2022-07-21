package com.manikanta.leetcode;

class MoveZeroes {
    public static void main(String[] args) {
        int nums[] = {0,0,1};
        moveZeroes(nums);
        for (int v :
                nums) {
            System.out.print(v+" ");
        }
    }
    public static void moveZeroes(int[] nums) {
        //brute force
        int n = nums.length;
        int arr[]  = new  int[n];
        int p = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i] != 0) arr[p++] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
        /*
        int n = nums.length;
        int inspos = 0;
        for(int v : nums){
            if(v != 0) nums[inspos++] = v;
        }
        while(inspos < n){
            nums[inspos++] = 0;
        }
        */



    }
}