package com.manikanta.leetcode;

//https://leetcode.com/problems/count-vowel-substrings-of-a-string/

public class CountVowelSubstringsOfAString {
    public static void main(String[] args) {
        String word = "cuaieuouac";
        int ans = countVowelSubstrings(word);
        System.out.println(ans);
    }
    public static int countVowelSubstrings(String word){
        int len = word.length(),count=0;
        if(len < 5) return count;
        for (int i = 0; i < len-4; i++) {
            int counta = 0,counte = 0,counti = 0,counto = 0,countu = 0;
            for (int j = i; j < len; j++) {
                char ch = word.charAt(j);

                if(ch == 'a') counta++;
                else if(ch == 'e') counte++;
                else if(ch == 'i') counti++;
                else if(ch == 'o') counto++;
                else if(ch == 'u') countu++;
                else {
                    counta = 0;
                    counte = 0;
                    counti = 0;
                    counto = 0;
                    countu = 0;
                    break;
                }
                if(counta != 0 && counte != 0 && counti != 0 && counto != 0 && countu != 0){
                    count++;
                    //System.out.println(word.substring(i,j));
                }

            }
        }
        return count;
    }
}
