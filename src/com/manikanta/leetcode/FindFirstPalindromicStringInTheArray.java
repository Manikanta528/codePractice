package com.manikanta.leetcode;

//https://leetcode.com/problems/find-first-palindromic-string-in-the-array/

public class FindFirstPalindromicStringInTheArray {
    public static void main(String[] args) {
        String words[] = {"abc","car","ada","racecar","cool"};
        String firstPal = firstPalindrome(words);
        System.out.println(firstPal);
    }
    public static String firstPalindrome(String[] words) {
        for(String str : words){
            StringBuilder rev = new StringBuilder(str);
            rev.reverse();
            if(str.equals(rev.toString())){
                return str;
            }
        }
        return "";
    }
}
