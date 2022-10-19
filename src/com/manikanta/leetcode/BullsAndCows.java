package com.manikanta.leetcode;

//https://leetcode.com/problems/bulls-and-cows/?envType=study-plan&id=level-1

import java.util.HashMap;
import java.util.Map;

public class BullsAndCows {
    public static void main(String[] args) {
        String secret = "1123" , guess = "0111";
        System.out.println(getHint(secret, guess));
    }

    private static String getHint(String secret, String guess) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int bull = 0,crow = 0;
        for (int i = 0; i < secret.length(); i++) {
            char c1 = secret.charAt(i), c2 = guess.charAt(i);
            if(c1 == c2){
                bull++;
                continue;
            }
            map1.put(c1, map1.getOrDefault(c1, 0)+1);
            map2.put(c2, map2.getOrDefault(c2,0)+1);
        }
        for(Map.Entry<Character,Integer> m : map1.entrySet()){
            if(map2.containsKey(m.getKey())){
                if(m.getValue() > map2.get(m.getKey())){
                    crow += (int)map2.get(m.getKey()).intValue();
                    map2.remove(m.getKey());
                }else{
                    crow += (int)m.getValue();
                }
            }
        }
        return ""+bull+"A"+crow+"B";
    }
}
