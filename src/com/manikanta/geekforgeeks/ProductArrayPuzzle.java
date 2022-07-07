package com.manikanta.geekforgeeks;

public class ProductArrayPuzzle {
    public static void main(String[] args) {
        int nums[] = {10, 3, 5, 6, 2};
        int n = nums.length;
        long[] ans = productExpectSelf(nums,n);
        for(long k : ans){
            System.out.print(k+" ");
        }
    }
    static long[] productExpectSelf(int[] nums,int n){
        long totPro = 1;
        long[] ans = new long[n];
        for(int i = 0 ; i < n; i++){
            totPro = 1;
            for(int j = 0 ; j < n ; j++){
                if(i != j){
                    totPro *= nums[j];
                }
            }
            ans[i]= totPro;
        }
        return ans;
    }
}
