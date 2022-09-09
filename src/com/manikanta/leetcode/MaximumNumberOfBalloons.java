package com.manikanta.leetcode;

//https://leetcode.com/problems/maximum-number-of-balloons/

import java.util.*;

public class MaximumNumberOfBalloons {
    public static void main(String[] args) {
        String text = "leetcode";
        int ans = maxNumberOfBalloons(text);
        System.out.println(ans);
    }
    public static int maxNumberOfBalloons(String text){
        int min = Integer.MAX_VALUE;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('b',0);
        map.put('a',0);
        map.put('l',0);
        map.put('o',0);
        map.put('n',0);

        int len = text.length();
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if(map.get(ch) != null){
                map.put(ch,map.get(ch)+1);
            }
        }
        for(Map.Entry<Character,Integer> m : map.entrySet() ){
            int val = m.getValue();
            if(val == 0){
                return 0;
            }
            char ch = m.getKey();
            if(ch == 'l' || ch == 'o'){
                int off = val/2;
                if(off < min) min = off;
            }else {
                int off = val/1;
                if(off < min) min = off;
            }
        }

        return min;
    }
}
