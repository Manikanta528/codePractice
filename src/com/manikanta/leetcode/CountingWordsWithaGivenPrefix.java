package com.manikanta.leetcode;

//https://leetcode.com/problems/counting-words-with-a-given-prefix/

public class CountingWordsWithaGivenPrefix {
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        int count = prefixCount(words, pref);
        System.out.println(count);
    }
    public static int prefixCount(String[] words, String pref){
        int count = 0;
        int size = pref.length();
        for(String s : words){
            if(size <= s.length() && pref.equals(s.substring(0,size))){
                count++;
            }
        }
        return count;
    }
}
