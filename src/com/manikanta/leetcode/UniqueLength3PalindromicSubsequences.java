package com.manikanta.leetcode;


import java.util.HashSet;

public class UniqueLength3PalindromicSubsequences {
    public static void main(String[] args) {
        String s = "abc";
        int ans = countPalindromicSubsequences(s);
        System.out.println(ans);
    }
    public static int countPalindromicSubsequences(String s){
        HashSet<String> set = new HashSet<>();
        int count = 0, len = s.length();
        for (int i = 0; i < len ; i++) {
            char ch = s.charAt(i);
            int f = s.indexOf(ch);
            int e = s.lastIndexOf(ch);
            if(f != e && f >= i){
                for (int j = i+1 ; j < e; j++) {
                    char c = s.charAt(j);
                    if(set.add(""+ch+c+ch)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
