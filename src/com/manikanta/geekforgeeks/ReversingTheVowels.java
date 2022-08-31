package com.manikanta.geekforgeeks;

public class ReversingTheVowels {
    public static void main(String[] args) {
        String s = "practice";
        String ans = modify(s);
        System.out.println(ans);
    }
    public static String modify(String s){
        String vow = "";
        String vowels = "aeiou";
        int len = s.length();
        for (int i = 0; i < len ; i++) {
            String str = s.substring(i,i+1);
            if(vowels.contains(str)){
                vow += str;
            }
        }
        int p = 0;
        for (int i = len-1; i >=0 ; i--) {
            String str = s.substring(i,i+1);
            if(vowels.contains(str)){
                s = s.substring(0,i)+vow.substring(p,p+1)+s.substring(i+1,len);
                p++;
            }
        }
        return s;
    }
}
