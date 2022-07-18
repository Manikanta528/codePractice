package com.manikanta.geekforgeeks;

public class MidoriChocolates {
    public static void main(String[] args) {
        int i = 2, l = 3;
        System.out.println(leftShops(i,l));
    }

    private static long leftShops(int i, int L) {
        long n = 1;
        while(L-- > 0){
            n=n<<1;
        }
        return n-i;
    }
}
