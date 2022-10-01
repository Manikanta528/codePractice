package com.manikanta.leetcode;

//https://leetcode.com/problems/removing-stars-from-a-string/

import java.util.Stack;

public class RemovingStarsFromAString {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }

    private static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == '*'){
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder str = new StringBuilder();
        int len = stack.size();
        while(len--> 0){
            str.insert(0,stack.pop());
        }
        return str.toString();
    }
}
