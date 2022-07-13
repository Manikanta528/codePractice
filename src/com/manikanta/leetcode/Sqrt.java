package com.manikanta.leetcode;

public class Sqrt {
    public static void main(String[] args) {
        int x = 2147483100;
        System.out.println(mySqrt(x));
    }
    static int mySqrt(int x){
        int start = 0 , end = x,ans = 0;
        long mid = 0;
        while(start <= end){
            mid = start+(end -start)/2;
            if((mid*mid) <= x){
                ans = (int)mid;
                start = (int)mid + 1;
            }
            else end = (int)mid -1;
        }
        return ans;
    }
}
