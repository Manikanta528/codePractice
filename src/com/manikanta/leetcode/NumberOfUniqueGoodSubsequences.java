package com.manikanta.leetcode;

//https://leetcode.com/problems/number-of-unique-good-subsequences/
//Time Limit Error

import java.util.ArrayList;
import java.util.HashSet;

public class NumberOfUniqueGoodSubsequences {
    public static void main(String[] args) {
        String binary = "111001101100000001001110110101110001100";
        int  ans = numberOfUniqueGoodSubsequence(binary);
        System.out.println(ans);
    }
    public static int numberOfUniqueGoodSubsequence(String binary){
        ArrayList<String> unqList = subsequence("",binary);
        HashSet<String> set = new HashSet<>();
        set.addAll(unqList);
        return set.size();
    }
    public static ArrayList<String> subsequence(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            if(p != ""){
                if(!p.substring(0,1).equals("0")){
                    list.add(p);
                }else if(p.substring(0,1).equals("0") && p.length() == 1){
                    list.add(p);
                }

            }
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subsequence(p+ch,up.substring(1));
        ArrayList<String > right = subsequence(p , up.substring(1));
        left.addAll(right);
        return left;
    }
}
