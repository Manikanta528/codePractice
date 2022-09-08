package com.manikanta.leetcode;

//https://leetcode.com/problems/reformat-the-string/

public class ReformatTheString {
    public static void main(String[] args) {
        String s = "a0b1c2";
        String ans = reformat(s);
        System.out.println(ans);
    }
    public static String reformat(String s){
        String num = "";
        String alp = "";
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9'){
                num += ch;
            }else {
                alp += ch;
            }
        }
        if(alp.length() != num.length() && alp.length() != num.length()-1 && alp.length()-1 != num.length()){
            return "";
        }
        String ans = "";
        int alplen = alp.length(),numlen = num.length();
        for (int i = 0; i < len / 2; i++) {
            if(alplen > numlen){
                ans += alp.charAt(i);
                ans += num.charAt(i);
            }else {
                ans += num.charAt(i);
                ans += alp.charAt(i);
            }
        }
        if(alplen > numlen){
            ans += alp.charAt(alplen-1);
        }else  if(numlen > alplen){
            ans += num.charAt(numlen-1);
        }
        return ans;
    }
}
