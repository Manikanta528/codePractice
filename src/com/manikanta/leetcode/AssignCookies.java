package com.manikanta.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/assign-cookies/

class AssignCookies {
    public static void main(String[] args) {
        int g[] = {1,2,3};
        int s[] = {1,1};
        System.out.println(findContentChildren(g,s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        int count = 0;
        int n = g.length;
        int m = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int gp = 0 , sp = 0;
        while(gp < n && sp < m){
            if(g[gp] <= s[sp]){
                count++;
                gp++;
                sp++;
            }else{
                sp++;
            }
        }
        return count;
    }
}