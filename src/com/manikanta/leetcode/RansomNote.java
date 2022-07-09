package com.manikanta.leetcode;

//https://leetcode.com/problems/ransom-note/

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "a", magazine = "aab";
        boolean ans = canConstruct(ransomNote,magazine);
        System.out.println(ans);
    }
    static boolean canConstruct(String ransomNote,String magazine){
        int arrRan[] = new int[26];
        int arrMag[] = new int[26];
        int hash;
        for(char c : ransomNote.toCharArray()){
            hash = (int)c-(int)'a';
            arrRan[hash]++;
        }
        for(char c: magazine.toCharArray()){
            hash = (int)c-(int)'a';
            arrMag[hash]++;
        }
        for (int i = 0; i < 26; i++) {
            if(arrRan[i] > 0){
                if(arrRan[i] <= arrMag[i]) continue;
                else if(arrRan[i] != arrMag[i]) return false;
            }
        }
        return true;
    }
}
