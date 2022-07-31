package com.manikanta.leetcode;

public class PowerOfThree {
    public static void main(String[] args) {
        int n = 6;
        boolean ans = isPowerOfThree(n);
        System.out.println(ans);
    }

    private static boolean isPowerOfThree(int n) {
        if(n == 1) return true;
        if(n == 0) return false;
        if(n%3 != 0) return false;

        return isPowerOfThree(n/3);
    }
}