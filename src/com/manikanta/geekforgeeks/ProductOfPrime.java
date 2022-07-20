package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/product-of-primes5328/1?page=1&status[]=unsolved&category[]=Prime%20Number&sortBy=submissions

class ProductOfPrime {
    public static void main(String[] args) {
        long L = 18468 , R = 18510;
        System.out.println(primeProduct(L,R));
    }
    static long primeProduct(long L, long R){
        // code here18468 18510
        long ans = 1;
        for (int i = (int)L; i <= (int)R; i++) {
            boolean p = checkPrime(i);
            if(p == true) ans = (ans*i)%1000000007;
        }
        return ans;
    }
    static boolean checkPrime(long v){
        if(v == 1 || v == 0) return false;
        for (int i = 2; i <= Math.sqrt(v); i++) {
            if(v%i == 0) return false;
        }
        return  true;
    }
}