package com.manikanta.leetcode;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String s = "azxxzy";
        System.out.println(removeDuplicates(s));
    }

    private static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(int i = 0; i < n ; i++ ){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else if(stack.peek() == s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();
        while(stack.size() > 0){
            ans.insert(0,stack.pop());
        }
        return ans.toString();
    }
}
