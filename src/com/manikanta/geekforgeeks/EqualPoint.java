package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/find-equal-point-in-string-of-brackets2542/1/?page=1&curated[]=3&sortBy=submissions


public class EqualPoint {
    public static void main(String[] args) {
        String str = "))()()()()(()()(()(";
        long ans = countSub(str);
        System.out.println(ans);
    }
    static long countSub(String str){
        int oBCount = 0, cBCount = 0;
        int len = str.length();
        for(int i = 0 ; i < len; i++){
            if(str.charAt(i) == ')') cBCount++;
        }
        for(int i =0 ; i < len; i++){
            if(str.charAt(i) == '(') oBCount++;
            else cBCount--;
            if(oBCount == cBCount) return i+1;
        }
        return 0;
    }
}
