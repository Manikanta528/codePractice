package com.manikanta.leetcode;

//https://leetcode.com/problems/backspace-string-compare/

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s ="a##c", t = "#a#c";
        System.out.println(backspaceCompare(s,t));
    }

    private static boolean backspaceCompare(String s, String t) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        int sLen = s.length(), tLen = t.length();
        for (int i = 0; i < sLen ; i++) {
            char ch = s.charAt(i);
            if(ch == '#' && !str1.isEmpty()){
                str1.setLength(str1.length() -1);
            }else if(ch != '#'){
                str1.append(ch);
            }
        }
        for (int i = 0; i < tLen ; i++) {
            char ch = t.charAt(i);
            if(ch == '#' && !str2.isEmpty()){
                str2.setLength(str2.length() -1);
            }else if(ch != '#'){
                str2.append(ch);
            }
        }
        return str1.toString().equals(str2.toString());
    }
}
