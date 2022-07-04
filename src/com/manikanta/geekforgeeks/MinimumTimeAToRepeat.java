package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/5ef42ba605fff6cd60b1b2dd2ee230ade1fa25b0/1/?page=1&curated[]=3&sortBy=submissions

public class MinimumTimeAToRepeat {
    public static void main(String[] args) {
        String A = "ab";
        String B = "abc";
        int ans = minRepeats(A,B);
        System.out.println(ans);
    }
    static int minRepeats(String A, String B){
        int count = 1, aLen = A.length(), bLen = B.length();
        //initial
        if( A.indexOf(B) > -1 ) return count;
        String temp = A;
        while(A.length() < B.length()){
            A += temp;
            count++;
        }
        //equal
        if(A.indexOf(B) > -1) return count;
        A += temp;
        count++;
        //more than b
        if(A.indexOf(B) > -1) return count;
        return -1;
    }
}
