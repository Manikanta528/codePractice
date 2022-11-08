package com.manikanta.leetcode;

//https://leetcode.com/problems/make-the-string-great/

import java.util.Stack;

public class MakeTheStringGreat {
    public static void main(String[] args) {
        String s = "leEeetcode";
        System.out.println(makeGood(s));
    }
    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){

            if(stack.isEmpty()){
                stack.push(ch);
            }else if((char)(stack.peek()-32) == ch || (char)(stack.peek()+32) == ch){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }

        if(stack.isEmpty()) return "";
        String res = "";
        int len = stack.size();
        for(int i = 0 ; i < len; i++){
            res = stack.pop() +res;
        }
        return res;
    }
}
