package com.manikanta.leetcode;

public class PowerOfFour {
    public static void main(String[] args) {
        int n = 8;
        boolean ans = isPowerOfFour(n);
        System.out.println(ans);
    }

    private static boolean isPowerOfFour(int n) {
        if(n == 1) return true;
        if(n == 0) return false;
        if(n%4 != 0) return false;

        return isPowerOfFour(n/4);
    }
}
