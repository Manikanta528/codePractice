package com.manikanta.geekforgeeks;

public class FindPositionOfSetBit {
    public static void main(String[] args) {
        int n = 16;
        System.out.print(findPostionOfSetBit(n));
    }

    private static int findPostionOfSetBit(int n) {
        int count = 0;
        int lc = 0;
        while(n > 0){
            if((n&1) == 1) count++;
            if(count > 1) return -1;
            lc++;
            n>>=1;
        }
        if(count == 1) return lc;
        return -1;
    }
}
