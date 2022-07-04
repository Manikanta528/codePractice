package com.manikanta.leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String array[] = {"dog","racecar","car"};
        String ans = longestCommonPrefix(array);
        System.out.println(ans);
    }
    static String longestCommonPrefix(String[] array){
        int arrLen = array.length;
        if(arrLen == 1) return array[0];
        int maxPre = Integer.MAX_VALUE;
        String str = "";
        for(int i = 0; i < arrLen-1; i++){
            char[] arr1 = array[i].toCharArray();
            char[] arr2 = array[i+1].toCharArray();
            int len1 = arr1.length, len2 = arr2.length;
            int minLen = (len1 >= len2) ? len2 : len1;
            int p = 0,count = 0;
            while(p < minLen && arr1[p] == arr2[p]){
                count++;
                p++;
            }
            if(count < maxPre){
                maxPre = count;
                str = array[i].substring(0, maxPre);
            }
        }
        return str;
    }
}
