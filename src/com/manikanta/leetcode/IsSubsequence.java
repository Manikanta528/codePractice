package com.manikanta.leetcode;

//https://leetcode.com/problems/is-subsequence/

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    private static boolean isSubsequence(String s, String t) {
        StringBuilder str = new StringBuilder();
        int n = s.length(), m = t.length();
        int p = 0;
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(p >= m) return false;
            for(int j = p ; j < m ; j++){
                if(ch == t.charAt(j)){
                    p= j+1;
                    str.append(ch);
                    break;
                }
            }
        }
        //System.out.println(str);
        if(s.equals(str.toString())) return true;
        return false;
    }

}
