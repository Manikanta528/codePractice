package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/check-if-two-strings-are-k-anagrams-or-not/1/?page=1&curated[]=3&sortBy=submissions

import java.util.HashMap;
import java.util.Map;

public class CheckIfTwoStringAreKAnagrams {
    public static void main(String[] args) {
        String s1 = "qufefzniwrhar";
        String s2 = "lzvnmuhlexhec";
        int k = 7;
        boolean ans = areKAnagrams(s1,s2,k);
        System.out.println(ans);

    }
    static boolean areKAnagrams(String s1, String s2,int k){
        if(s1.length() != s2.length()) return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        mapAdd(s1,map1);
        mapAdd(s2,map2);
        int anaCount = 0, nonAnaCount = 0;
        for(Map.Entry<Character, Integer> m : map1.entrySet()){
            char key = m.getKey();
            int val = m.getValue();
            if(map2.get(key) != null && map2.get(key) >= val ) anaCount+= val;
            else if(map2.get(key) != null && map2.get(key) < val ) anaCount += map2.get(key);
        }
        if(s1.length() - anaCount <= k) return true;
        return false;
    }
    static void mapAdd(String s, HashMap<Character,Integer> map){
        for(char c : s.toCharArray()){
            map.putIfAbsent(c,0);
            map.put(c, map.get(c)+1);
        }
    }
}
