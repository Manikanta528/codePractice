package com.manikanta.leetcode;

//https://leetcode.com/problems/truncate-sentence/

public class TruncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        String ans = trunacteSentence(s,k);
        System.out.println(ans);
    }
    public static String trunacteSentence(String s,int k){
        String[] arr = s.split(" ");
        String ans = "";
        for (int i = 0; i < k; i++) {
            if(i== k-1){
                ans += arr[i];
            }else {
                ans += arr[i] + " ";
            }
        }
        return ans;
    }
}
