package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/find-first-set-bit-1587115620/1?page=1&category[]=Bit%20Magic&sortBy=submissions

public class FindFirstSetBit {
    public static void main(String[] args) {
        int n = 32;
        System.out.println(findFirstSetBit(n));
    }

    private static int findFirstSetBit(int n) {
        int c = 1;
        if(n==0) return 0;
        while(true){
            if( (n&1) == 1) break;
            c++;
            n=n>>1;
        }
        return c;
    }
}
