package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/modified-numbers-and-queries0904/1

public class ModifiedNumbersAndQueries {
    public static void main(String[] args) {
        int l = 1, r = 6;
        System.out.println(sumOfAll(l, r));
    }

    private static int sumOfAll(int l, int r) {
        int sum = 0;
        for (int i = l; i <= r ; i++) {
            if(i == 1) sum++;
            sum += primeFactors(i);
        }
        return sum;
    }

    private static int primeFactors(int i) {
        int sum = 0;
        for (int j = 2; j <= i ; j++) {
            if(i%j == 0 && prime(j)){
                sum += j;
            }
        }
        return sum;
    }

    private static boolean prime(int j) {
        int count = 0;
        for (int i = 2; i <= Math.sqrt(j); i++) {
            if(j%i == 0){
                count++;
                break;
            }
        }
        return count == 0;
    }

}
