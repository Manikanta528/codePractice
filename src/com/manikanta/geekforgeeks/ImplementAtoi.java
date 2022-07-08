package com.manikanta.geekforgeeks;

public class ImplementAtoi {
    public static void main(String[] args) {
        String str = "-12";
        int ans = atoi(str);
        System.out.println(ans);
    }
    static int atoi(String str){
        int len = str.length()-1;
        char c;
        int ans = 0;
        int temp,p=0;
        for (int i = len; i >= 0; i--) {
            c = str.charAt(i);
            if(c >= '0' && c <= '9'){
                temp = c-'0';
                ans += temp*((int)Math.pow(10,p++));
            }
            else if(i == 0 && c == '-'){
                ans *=-1;
            }
            else return -1;
        }
        return ans;
    }
}
