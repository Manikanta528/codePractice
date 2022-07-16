package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/set-bits0143/1?page=1&category[]=Bit%20Magic&sortBy=submissions

public class NumOf1Bits {
    public static void main(String[] args) {
        int n = 1000000000;
        System.out.println(setBits(n));
    }

    private static int setBits(int N) {
        int count = 0;
        while(N > 0){
            if((N&1) == 1) count++;
            N=N>>1;
        }
        return count;
    }
}
