package com.manikanta.leetcode;

//https://leetcode.com/problems/thousand-separator/

public class ThousandSeparator {
    public static void main(String[] args) {
        int n = 987;
        String ans = thousandSeparator(n);
        System.out.println(ans);
    }
    public static String thousandSeparator(int n){
        StringBuilder num = new StringBuilder(Integer.toString(n));
        num.reverse();
        if(num.length() < 3){
            return num.toString();
        }
        String ans = "";
        int p = 0;
        while(p < num.length()){
            if((p+1)%3 == 0 && p+1 != num.length() ){
                ans += num.charAt(p) +".";
                p++;
                continue;
            }
            ans += num.charAt(p);
            p++;
        }
        StringBuilder res = new StringBuilder(ans);
        return res.reverse().toString();
    }
}
