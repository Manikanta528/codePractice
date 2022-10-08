package com.manikanta.leetcode;

//https://leetcode.com/problems/isomorphic-strings/

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println(isIsoMorphic(s,t));
    }

    private static boolean isIsoMorphic(String s, String t) {
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        for(int i = 0 ; i < s.length(); i++){
            map1.put(s.charAt(i), t.charAt(i));
            map2.put(t.charAt(i),s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            if(map1.get(s.charAt(i)) != t.charAt(i) || map2.get(t.charAt(i)) != s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
