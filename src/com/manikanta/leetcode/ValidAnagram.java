package com.manikanta.leetcode;

//https://leetcode.com/problems/valid-anagram/submissions/

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "car";
        String t = "rat";
        boolean ans = isAnagram(s,t);
        System.out.println(ans);
    }
    static boolean isAnagram(String s,String t){
        HashMap<Character,Integer> map1 = new LinkedHashMap<>();
        HashMap<Character,Integer> map2 = new LinkedHashMap<>();
        mapping(map1,s);
        mapping(map2,t);

        //display(map1);
        //display(map2);
        if(map1.size() != map2.size()) return false;
        if(map1.equals(map2)) return true;
        return false;
    }
    static void mapping(HashMap<Character,Integer> map, String str){
        for (char c :
                str.toCharArray()) {
            map.putIfAbsent(c, 0);
            map.put(c,map.get(c)+1);
        }
    }
    static void display(HashMap<Character,Integer> map){
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            System.out.print(m.getKey()+"->"+m.getValue()+" ");
        }
        System.out.println();
    }
}
