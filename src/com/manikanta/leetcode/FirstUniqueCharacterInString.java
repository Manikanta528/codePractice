package com.manikanta.leetcode;

//https://leetcode.com/problems/first-unique-character-in-a-string/

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int ans = firstUniqChar(s);
        System.out.println(ans);
    }
    static int firstUniqChar(String s){
        int ans = -1;
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char c : s.toCharArray()){
            map.putIfAbsent(c,0);
            map.put(c,map.get(c)+1);
        }
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            if(m.getValue() == 1) return s.indexOf(m.getKey());
        }
        return -1;
    }
}
