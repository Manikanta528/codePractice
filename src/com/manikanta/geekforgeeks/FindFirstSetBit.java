package com.manikanta.geekforgeeks;

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
