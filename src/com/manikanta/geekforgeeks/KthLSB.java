package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/kth-lsb3427/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Bit%20Magic&sortBy=submissions


public class KthLSB {
    public static void main(String[] args) {
        int n = 10, k  = 3;
        System.out.println(kthLSB(n,k));
    }

    private static int kthLSB(int n, int k) {
        if(n == 0) return 0;
        while(k-- > 1){
            n=n>>1;
        }
        if((n&1)== 0) return 0;
        return 1;
    }
}
