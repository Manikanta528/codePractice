package com.manikanta.leetcode;


//https://leetcode.com/problems/license-key-formatting/


import java.util.ArrayList;
import java.util.List;

public class LicenseKeyFormatting {
    public static void main(String[] args) {
        String s = "2-5g-3-J";
        int k = 2;
        String ans  = licenseKeyFormating(s,k);
        System.out.println(ans);
    }
    public static String licenseKeyFormating(String s , int k){
        String[] spl = s.split("-");
        String temp = "";
        for(String i : spl){
            temp += i;
        }
        int len = temp.length();
        List<String> list = new ArrayList<>();
        while(len > 0){
            list.add(0,temp.substring(Math.max(0,len-k), len));
            len -=k;
        }
        temp ="";
        //System.out.println(list);
        for(int i = 0 ; i < list.size(); i++){
            if(i != list.size()-1){
                temp += list.get(i)+"-";
                continue;
            }
            temp +=list.get(i);
        }
        return temp.toUpperCase();
    }
}
