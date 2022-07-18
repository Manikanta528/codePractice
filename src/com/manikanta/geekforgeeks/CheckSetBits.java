package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/check-set-bits5408/1?page=2&category[]=Bit%20Magic&sortBy=submissions

public class CheckSetBits {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(checkSetBits(n));
    }

    private static int checkSetBits(int N) {
        if(N == 0 ) return 0;
        int count=0;
        int lc=0;
        while(N > 0){
            if((N&1) == 1) count++;
            lc++;
            if(lc != count) return 0;
            N>>=1;
        }
        return 1;
    }
}
