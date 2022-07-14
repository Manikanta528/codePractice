package com.manikanta.leetcode;

import java.util.*;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }
    static int numJewelsInStones(String jewels,String stones){
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        for(char c : stones.toCharArray()){
            map.putIfAbsent(c,0);
            map.put(c,map.get(c)+1);
        }
        int count = 0;
        for(char c : jewels.toCharArray()){
            if(map.get(c) != null) count+=map.get(c);
        }
        return count;
    }
}
