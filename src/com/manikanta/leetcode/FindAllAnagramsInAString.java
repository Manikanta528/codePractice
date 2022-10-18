package com.manikanta.leetcode;

//https://leetcode.com/problems/find-all-anagrams-in-a-string/?envType=study-plan&id=level-1

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        System.out.println(findAnagrams(s,p));
    }

    private static List<Integer> findAnagrams(String s, String p) {
        if(p.length() > s.length()) return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char c : p.toCharArray()){
            map1.put(c, map1.getOrDefault(c,0) +1);
        }
        for (int i = 0; i < p.length(); i++) {
            char c = s.charAt(i);
            map2.put(c, map2.getOrDefault(c,0) +1);
        }
        if(map1.equals(map2)) list.add(0);
        int pt = 1;
        for (int i = p.length(); i < s.length(); i++) {
            //System.out.print(pt);
            char c = s.charAt(pt-1);
            if(map2.get(c) > 1){
                map2.put(c,map2.get(c)-1);
            }else{
                map2.remove(c);
            }
            map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i),0)+1);
            if(map1.equals(map2)) list.add(pt);
            pt++;
            //System.out.println(map1+" "+map2);

        }
        return list;
    }
}
