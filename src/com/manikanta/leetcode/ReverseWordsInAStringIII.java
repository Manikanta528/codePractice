package com.manikanta.leetcode;

//https://leetcode.com/problems/reverse-words-in-a-string-iii/


public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        System.out.println(reverseWords(str));
    }
    public static String reverseWords(String s){
//        String str1 = "";
//        String arr[] = s.split(" ");
//        int len = arr.length;
//        for (int i = 0; i < len; i++) {
//            for (int j = arr[i].length()-1; j >=0 ; j--) {
//                str1 += arr[i].charAt(j);
//            }
//            if(i != len-1) str1 +=" ";
//        }
//        return str1;

        String str1 = "";
        String arr[] = s.split(" ");
        int len = arr.length;
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < len; i++) {
            // for (int j = arr[i].length()-1; j >=0 ; j--) {
            //     str1 += arr[i].charAt(j);
            // }
            temp = new StringBuilder(arr[i]);
            temp.reverse();
            str1 += temp.toString();
            if(i != len-1) str1 +=" ";
        }
        return str1;
    }
}
