package com.manikanta.leetcode;

class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        for(char c : s){
            System.out.print(c+" ");
        }
    }
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        helper(s,start,end);
    }
    public static void helper(char[] s, int start,int end){
        if(start == s.length/2) return;
        char ch = s[start];
        s[start] = s[end];
        s[end] = ch;
        
        helper(s,start+1,end-1);
        
    }
}