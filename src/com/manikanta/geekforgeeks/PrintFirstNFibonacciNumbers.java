package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers1002/1/?page=3&difficulty[]=-1&sortBy=submissions#

public class PrintFirstNFibonacciNumbers {
    public static void main(String[] args) {
        int n = 7;
        long fibo[] = printFibb(n);
        for(long x : fibo){
            System.out.print(x+" ");
        }
    }
    static long[] printFibb(int n){
        long fibo[] = new long[n];
        if(n == 1) {
            fibo[0] = 1;
            return fibo;
        }
        fibo[0] = 1;
        fibo[1] = 1;
        for(int i = 2; i < n; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        return fibo;
    }
}
