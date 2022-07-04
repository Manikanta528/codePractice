package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/closest-strings0611/1/?page=1&curated[]=3&sortBy=submissions#

import java.util.ArrayList;
import java.util.Arrays;

public class ClosestStrings {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>(
                Arrays.asList("geeks", "for", "geeks", "contribute",
                        "practice"));
        String word1 = "geeks",word2 = "practice";
        int ans = shortestDistance(s,word1,word2);
        System.out.println(ans);
    }
    static int shortestDistance(ArrayList<String> s, String word1, String word2){
        if(word1.equals(word2) && s.contains(word1)) return 0;
        if(!s.contains(word1)) return 0;
        if(!s.contains(word2)) return 0;
        ArrayList<Integer> w1 = new ArrayList<Integer>();
        ArrayList<Integer> w2 = new ArrayList<Integer>();
        for(int i = 0 ; i < s.size(); i++){
            if(word1.equals(s.get(i))) w1.add(i);
            else if(word2.equals(s.get(i))) w2.add(i);
        }
        int minDis = Integer.MAX_VALUE;
        if(w1.get(w1.size()-1) < w2.get(0) ) return w2.get(0) - w1.get(w1.size()-1);
        else {
            int t1 , dis;
            for(int i = 0 ; i < w1.size(); i++){
                t1 = w1.get(i);
                for(int j = 0 ; j < w2.size(); j++){
                    dis = Math.abs(t1 - w2.get(j));
                    if(dis < minDis) minDis = dis;
                }
            }
        }


        return minDis;
    }
}
