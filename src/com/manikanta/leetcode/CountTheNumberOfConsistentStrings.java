package com.manikanta.leetcode;

//https://leetcode.com/problems/count-the-number-of-consistent-strings/

public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        String allowed = "abc";
        String words[] = {"a","b","c","ab","ac","bc","abc"};
        int ans = countConsistentStrings(allowed,words);
        System.out.println(ans);
    }
    public static int countConsistentStrings(String allowed, String[] words){
        int count = 0;
        int len = words.length;
        for(int i = 0 ; i < len; i++ ){
            int internalCount = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if(allowed.contains(words[i].substring(j,j+1))){
                    internalCount++;
                }else {
                    break;
                }
            }
            if(internalCount == words[i].length()){
                count++;
            }
        }
        return count;
    }
}
