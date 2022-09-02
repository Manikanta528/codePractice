package com.manikanta.leetcode;

//https://leetcode.com/problems/repeated-dna-sequences/

import java.util.*;

public class RepeatedDNASequences {
    public static void main(String[] args) {
        String s = "AAAAAAAAAAA";
        List<String> list = findRepeatedDNASequences(s);
        System.out.println(list);
    }
    public static List<String> findRepeatedDNASequences(String s){

        Set<String> set = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        int len = s.length();
        for (int i = 0; i < len-9; i++) {
            String str = s.substring(i,i+10);
            if(!set.add(str)){
                repeated.add(str);
            }
        }
        return new ArrayList<>(repeated);
    }
}
