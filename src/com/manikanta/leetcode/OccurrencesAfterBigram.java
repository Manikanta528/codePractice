package com.manikanta.leetcode;

//https://leetcode.com/problems/occurrences-after-bigram/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OccurrencesAfterBigram {
    public static void main(String[] args) {
        String text = "alice is a good girl she is a good student";
        String first = "a";
        String second = "good";
        String[] ans = findOccurance(text, first, second);
        System.out.println(Arrays.toString(ans));
    }
    public static String[] findOccurance(String text, String first, String second){
        List<String> ans = new ArrayList<>();
        String[] textarr = text.split(" ");
        int len = textarr.length;
        for (int i = 0; i < len -2 ; i++) {
            if(textarr[i].equals(first) && textarr[i+1].equals(second)){
                ans.add(textarr[i+2]);
            }
        }
        String[] arr = new String[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }
}
