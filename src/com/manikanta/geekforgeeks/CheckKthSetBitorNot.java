package com.manikanta.geekforgeeks;

public class CheckKthSetBitorNot {
    public static void main(String[] args) {
        int n = 4,k = 2;
        System.out.println(checkKthBit(n,k));
    }
    static boolean checkKthBit(int n, int k){
        int p=0,rem;
        while(n>0){
            rem = n%2;
            if(p == k){
                if(rem == 1) return true;
                break;
            }
            n/=2;
            p++;
        }
        return false;
    }
}
