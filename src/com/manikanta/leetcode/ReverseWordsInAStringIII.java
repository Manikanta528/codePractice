package com.manikanta.leetcode;


public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        System.out.println(reverseWords(str));
    }
    public static String reverseWords(String s){
        String str1 = "";
        String arr[] = s.split(" ");
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = arr[i].length()-1; j >=0 ; j--) {
                str1 += arr[i].charAt(j);
            }
            if(i != len-1) str1 +=" ";
        }
        return str1;
    }
}
