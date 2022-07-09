package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/count-numbers-containing-43022/1/?page=1&difficulty[]=-1&category[]=Dynamic%20Programming&sortBy=submissions#

public class CountNumContaining4 {
    public static void main(String[] args) {
        int N = 50;
        int ans = countNumberswith4(N);
        System.out.println(ans);
    }
    static int countNumberswith4(int N){
        StringBuilder temp = new StringBuilder();
        int count = 0;
        for(int i = 1 ; i <=N ;i++){
            temp = new StringBuilder(Integer.toString(i));
            for(char c : temp.toString().toCharArray()){
                if(c == '4'){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
