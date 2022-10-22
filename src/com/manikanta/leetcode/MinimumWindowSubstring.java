package com.manikanta.leetcode;

//https://leetcode.com/problems/minimum-window-substring/

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "caae", t = "cae";
        System.out.println(minWindow(s,t));
    }
    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> mapt = new HashMap<>();
        for(int i = 0 ; i < t.length(); i++){
            mapt.put(t.charAt(i), mapt.getOrDefault(t.charAt(i), 0)+1);
        }
        System.out.println(mapt);
        String res = "";
        int pl = 0 , pr = t.length()-1;
        for(int i = t.length() ; i <= s.length(); i++ ){
            pl = 0 ;
            pr = i;
            res  = getWindow(s,mapt,pl,pr,res);
            if(res.length() >= t.length() ){
                break;
            }
        }
        return res;
    }
    public static String getWindow(String s, HashMap<Character, Integer> mapt , int pl, int pr , String res){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < pr ; i++){
            //System.out.print(s.charAt(i));
            if(mapt.containsKey(s.charAt(i)))
                map.put(s.charAt(i) , map.getOrDefault(s.charAt(i), 0)+1);
        }
        if(map.equals(mapt)){

            return s.substring(0, pr);
        }
        for(int i = 0 ; i < s.length() - pr ; i++){
            System.out.println(s.charAt(i)+" "+s.charAt(i+pr));
            if(mapt.containsKey(s.charAt(i+pr)))
                map.put(s.charAt(i+pr) , map.getOrDefault(s.charAt(i+pr), 0)+1);

            if(mapt.containsKey(s.charAt(i)) && ( map.containsKey(s.charAt(i)) && (map.get(s.charAt(i)) != null && map.get(s.charAt(i)) > 1))){
                map.put(s.charAt(i) , map.get(s.charAt(i)) -1);
            }else if(mapt.containsKey(s.charAt(i)) || map.containsKey(s.charAt(i))){
                map.remove(s.charAt(i));
            }

            if(map.equals(mapt)){
                res = s.substring(i+1,i+pr+1);
                break;
            }
            if(isEquals(mapt,map)){
                res = s.substring(i+1,i+pr+1);
                break;
            }
        }
        //System.out.println(res);
        if(isEquals(mapt,map)){
            res = s.substring(0,pr);
        }
        return res;
    }
    public static boolean isEquals(HashMap<Character, Integer> mapt , HashMap<Character, Integer> map){
        if(mapt.size() != map.size()) return false;

        for(Map.Entry<Character, Integer> m : map.entrySet()){

            if(m.getValue() < mapt.get(m.getKey())){
                return false;
            }
        }
        return true;
    }
}

