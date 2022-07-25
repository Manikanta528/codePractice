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
        //recursion
        //helper(s,start,end);
        while(start < end){
            //iteration
            char ch = s[start];
            s[start] = s[end];
            s[end] = ch;
            end--;
            start++;
        }
    }
    public static void helper(char[] s, int start,int end){
        //recursion
        if(start == s.length/2) return;
        char ch = s[start];
        s[start] = s[end];
        s[end] = ch;
        
        helper(s,start+1,end-1);
        
    }
}