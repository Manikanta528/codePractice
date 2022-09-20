package com.manikanta.leetcode;

//https://leetcode.com/problems/add-digits/

public class AddDigits {
    public static void main(String[] args) {
        int num = 38;
        int ans = addDigits(num);
        System.out.println(ans);
    }
    public static int addDigits(int num) {
        if(num < 10 ){
            return num;
        }
        int rem = 0, sum = 0;
        while(num > 0){
            rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return addDigits(sum);
    }
}
