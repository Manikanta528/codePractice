package com.manikanta.leetcode;

//https://leetcode.com/problems/first-letter-to-appear-twice/

public class FirstLetterToAppearTwice {
    public static void main(String[] args) {
        String str = "abccbaacz";
        char ans = repeatedCharacter(str);
        System.out.println(ans);
    }
    public static char repeatedCharacter(String s){
        int[] arr = new int[26];
        int len = s.length();
        char ch = 'a';
        for (int i = 0; i < len; i++) {
             ch = s.charAt(i);
             arr[ch-'a']++;
             if(arr[ch-'a'] == 2){
                 break;
             }
        }
        return ch;
    }
}
