package com.manikanta.leetcode;

//https://leetcode.com/problems/second-largest-digit-in-a-string/

public class SecondLargestDigitInAString {
    public static void main(String[] args) {
        String s = "dfa12321afd";
        int num = secondHighest(s);
        System.out.println(num);
    }
    public static int secondHighest(String s){
        int arr[] = new int[10];
        for(char ch : s.toCharArray()){
            if(ch >= '0' && ch <= '9'){
                arr[ch-'0']++;
            }
        }
        int count = 0;
        for (int i = 9; i >= 0; i--) {
            if(arr[i] > 0) count++;
            if(count == 2) return i;
        }
        return -1;
    }
}
