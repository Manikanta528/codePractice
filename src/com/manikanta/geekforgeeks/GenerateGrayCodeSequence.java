package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/generate-grey-code-sequences/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Bit%20Magic&sortBy=submissions

import java.util.*;

public class GenerateGrayCodeSequence {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<String> list = generateCode(n);
        System.out.println(list.toString());
    }

    private static ArrayList<String> generateCode(int n) {
        ArrayList<String> ans = new ArrayList<String>();
        String z = "0000000000000000";
        int i = 0;
        int num = (int)Math.pow(2,n);
        while(num > i){
            int g=i^(i>>1);
            i++;
            String gray = Integer.toBinaryString(g);

            if(gray.length() > n) break;
            if(gray.length() == n) {
                ans.add(gray);
                continue;
            }
            if(gray.length() < n){
                gray = z.substring(0,n-gray.length())+gray;
                ans.add(gray);
            }

        }

        return ans;
    }

}
