package com.manikanta.leetcode;

//https://leetcode.com/problems/number-of-matching-subsequences/submissions/

import java.util.HashMap;

public class NumberOfMatchingSubsequences {
    public static void main(String[] args) {
        String s = "abcde", words[] = {"a","bb","acd","ace"};
        System.out.println(numMatchingSubseq(s, words));
    }
    public static int numMatchingSubseq(String s, String words[]){
        int count = 0,n = words.length;
        HashMap<String,Integer> map = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(map2.containsKey(words[i])) continue;
            if(map.containsKey(words[i]) || isSubsequence(words[i],s)){
                map.putIfAbsent(words[i],0);
                count++;
            }else{
                map2.putIfAbsent(words[i],0);
            }
        }
        return count;
    }
    public static boolean isSubsequence(String s, String t) {
        StringBuilder str = new StringBuilder();
        int n = s.length(), m = t.length();
        int p = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (p >= m) return false;
            for (int j = p; j < m; j++) {
                if (ch == t.charAt(j)) {
                    p = j + 1;
                    str.append(ch);
                    break;
                }
            }
        }
        //System.out.println(str);
        if (s.equals(str.toString())) return true;
        return false;
    }
}
