package com.manikanta.leetcode;

//https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/

import java.util.HashMap;

public class CheckIfNumberHasEqualDigitCountAndDigitValue {
    public static void main(String[] args) {
        String num = "1210";
        System.out.println(digitCount(num));
    }
    public static boolean digitCount(String num) {
        int len = num.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < 10 ; i++){
            map.put((char)('0'+i), 0);
        }
        for(char c : num.toCharArray()){
            map.put(c,map.get(c)+1);
        }
        for(int i = 0 ; i < len ; i++){
            char ch = num.charAt(i);
            if(map.get((char)('0'+i)) != (int)(ch-'0')) return false;
        }
        return true;
    }
}
