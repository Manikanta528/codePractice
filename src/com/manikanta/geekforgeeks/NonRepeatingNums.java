package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/finding-the-numbers0215/1?page=1&category[]=Bit%20Magic&sortBy=submissions

import java.util.*;

public class NonRepeatingNums {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 2, 1, 4};
        int ans[] = singleNumber(nums);
        for(int i : ans) System.out.print(i+" ");
    }

    private static int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int v : nums){
            map.putIfAbsent(v,0);
            map.put(v,map.get(v)+1);
        }
        int i =0;
        int ans [] = new int[2];
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(i == 2) break;
            if(m.getValue() == 1) ans[i++] = m.getKey();
        }
        if( ans[0] > ans[1]){
            int temp = ans[0];
            ans[0] = ans[1];
            ans[1] = temp;
        }
        return ans;
    }
}
