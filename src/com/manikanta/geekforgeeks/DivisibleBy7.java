package com.manikanta.geekforgeeks;

import java.util.Arrays;

public class DivisibleBy7 {
    public static void main(String[] args) {
        String num = "41270242734102349233";
        int ans = isdivisible7(num);
        System.out.println(ans);
    }
    public static int isdivisible7(String num){
        int len = num.length();
        int arr[] = new int[(len/3)+1];
        int p = len;
        for (int i = 0; i < arr.length; i++) {
            if(p-3 > 0){
                arr[i] = Integer.parseInt(num.substring(p-3,p));
                p-=3;
            }
            else if(p == 1 || p == 2){
                arr[i] = Integer.parseInt(num.substring(0,p));

            }

        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if((i&1) == 1){
                sum -= arr[i];
            }
            else{
                sum += arr[i];
            }
        }
        if(sum%7 == 0){
            return 1;
        }
        return 0;
    }
}
