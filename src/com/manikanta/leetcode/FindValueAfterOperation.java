package com.manikanta.leetcode;

public class FindValueAfterOperation {
    public static void main(String[] args) {
        String operations[] = {"X++","++X","--X","X--"};
        int ans = findValueAfterOperation(operations);
        System.out.println(ans);
    }
    static int findValueAfterOperation(String[] operations){
        int x = 0;
        for(String s : operations){
            if(s.indexOf("+") > -1) x++;
            else x--;
        }
        return x;
    }
}
