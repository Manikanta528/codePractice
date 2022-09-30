package com.manikanta.leetcode;

//https://leetcode.com/problems/self-dividing-numbers/

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        int left = 1, right = 22;
        List<Integer> list = selfDividingNumbers(left,right);
        System.out.println(list);
    }

    private static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            boolean div = selfDivideOrNot(i);
            if(div){
                list.add(i);
            }
        }
        return list;
    }

    private static boolean selfDivideOrNot(int i) {
        if(i == 0 )return false;
        int rem = 0;
        int temp = i;
        while(i > 0){
            rem = i%10;
            if(rem == 0) return false;
            if(temp%rem != 0) return false;
            i /=10;
        }
        return true;
    }
}
