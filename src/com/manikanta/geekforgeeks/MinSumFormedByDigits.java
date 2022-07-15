package com.manikanta.geekforgeeks;

import java.util.Arrays;

public class MinSumFormedByDigits {
    public static void main(String[] args) {
        int arr[] = {5, 3, 0, 7, 4};
        int n = arr.length;
        System.out.println(minSum(arr,n));
    }
    static long minSum(int arr[], int n){
        long n1= 0, n2 = 0,ans = 0;
        Arrays.sort(arr);
        int p = 0;
        for(int i = n-1 ; i >= 0 ; i-=2){
            n2 = (long)Math.pow(10,p)*arr[i] +n2;
            if(i-1 > -1) n1 = (long)Math.pow(10,p)*arr[i-1] +n1;
            p++;
        }
        ans = n1+n2;
        return ans;
    }
}
