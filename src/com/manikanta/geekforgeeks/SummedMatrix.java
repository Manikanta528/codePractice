package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/summed-matrix5834/1?page=1&curated[]=8&sortBy=submissions

public class SummedMatrix {
    public static void main(String[] args) {
        long n = 4, q = 7;
        System.out.println(sumMatrix(n,q));
    }
    public static long sumMatrix(long n, long q) {
        if(Math.abs(n-q) > n) return 0;
        long count = 0;
        if( n >= q) {
            count =  q-1;
        }else{
            q = q - n;
            count = n-q+1;
        }
        return count;
    }
}
