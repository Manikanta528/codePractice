package com.manikanta.leetcode;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String str = "a good   example";
        System.out.println(reverseWords(str));
    }
    public static String reverseWords(String s) {
        String ans = "";
        String arr[] = s.split("\\s+");
        System.out.println(arr.length);
        for (int i = arr.length-1; i >= 0; i--) {

            if(i != 0){
                ans += arr[i] +" ";
            }else {
                ans += arr[i];
            }
        }
        return ans;
    }
}
