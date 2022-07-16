package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/rightmost-different-bit-1587115621/1?page=1&category[]=Bit%20Magic&sortBy=submissions

public class RightMostDiffBit {
    public static void main(String[] args) {
        int m = 11 ,n = 9;
        System.out.println(posOfRightMostDiffBit(m,n));
    }

    private static int posOfRightMostDiffBit(int m, int n) {
        if(m==n) return -1;
        int a = m^n,c=1;
        while(a > 0){
            if((a&1)==1) break;
            c++;
            a=a>>1;
        }
        return c;
    }

}
