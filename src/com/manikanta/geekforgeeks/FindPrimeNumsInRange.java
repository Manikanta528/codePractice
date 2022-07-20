package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/find-prime-numbers-in-a-range4718/1?page=1&status[]=unsolved&category[]=Prime%20Number&sortBy=submissions
import java.util.ArrayList;

class FindPrimeNumsInRange {
    public static void main(String[] args) {
        int M = 1,N=10;
        System.out.println(primeRange(M,N));
    }
    static ArrayList<Integer> primeRange(int M, int N) {
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = M ; i <= N ; i++){
            boolean p = checkPrime(i);
            if(p == true) list.add(i);
        }
        return list;
    }
    static boolean checkPrime(int v){
        if (v == 1) return  false;
        for (int i = 2; i <= Math.sqrt(v); i++) {
            if(v%i == 0) return false;
        }
        return true;
    }
}