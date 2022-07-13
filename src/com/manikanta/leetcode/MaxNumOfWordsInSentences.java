package com.manikanta.leetcode;

public class MaxNumOfWordsInSentences {
    public static void main(String[] args) {
        String[] arr = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(arr));
    }
    static int mostWordsFound(String[] arr){
        int max = 0;
        for(int i  = 0 ; i < arr.length ; i++){
            String[] temp = arr[i].split(" ");
            if(max < temp.length) max = temp.length;
        }
        return max;
    }
}
