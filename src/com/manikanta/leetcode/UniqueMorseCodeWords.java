package com.manikanta.leetcode;

//https://leetcode.com/problems/unique-morse-code-words/

import java.util.HashMap;

public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};
        int res = uniqueMorseRepresentations(words);
        System.out.println(res);

    }
    static public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] ans = new String[words.length];
        int n = 0;
        for (String i : words) {
            String temp = "";
            for(char c : i.toCharArray()){
                int ind = (int)(c-'a');
                temp+=morse[ind];
            }
            ans[n++] = temp;
        }
        HashMap<String,Integer> map = new HashMap<>();
        for(String i : ans){
            map.putIfAbsent(i,0);
        }
        return map.size();
    }
}
