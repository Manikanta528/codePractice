package com.manikanta.leetcode;

//https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/

public class PrimeNumberOfSetBitsInBinaryRepresentation {
    public static void main(String[] args) {
        int left = 5 , right = 10;
        int ans = countPrimeSetBits(left, right);
        System.out.println(ans);
    }
    public static  int countPrimeSetBits(int left, int right){
        int count = 0;
        for (int i = left; i <= right; i++) {
            int bits = Integer.bitCount(i);
            if(bits == 1 || bits == 0) continue;
            int primeOrNot = 0;
            for (int j = 2; j <= Math.sqrt(bits); j++) {
                if(bits%j == 0) {
                    primeOrNot++;
                    break;
                }
            }
            if(primeOrNot == 0) count++;
        }
        return count;
    }

}
