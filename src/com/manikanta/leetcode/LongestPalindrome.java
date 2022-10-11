package com.manikanta.leetcode;

//https://leetcode.com/problems/longest-palindrome/

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }

    private static int longestPalindrome(String s) {
        int count = 0,flag = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for (char c : s.toCharArray()){
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c)+1);
        }
        for(Map.Entry<Character, Integer> m : map.entrySet()){
            if(m.getValue() % 2 == 1 && flag == 0){
                count += m.getValue();
                flag = 1;
                continue;
            }
            if(m.getValue() % 2 == 1 && flag == 1){
                count += m.getValue()-1;
            }else {
                count += m.getValue();
            }
        }

        return count;
    }
}
