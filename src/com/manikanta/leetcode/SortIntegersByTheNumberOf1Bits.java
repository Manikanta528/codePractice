package com.manikanta.leetcode;

//https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/

import java.util.*;

public class SortIntegersByTheNumberOf1Bits {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7,8};
        int ans[] = sortByBits(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] sortByBits(int[] arr) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.putIfAbsent(Integer.bitCount(arr[i]), new ArrayList<>());
            map.get(Integer.bitCount(arr[i])).add(arr[i]);
        }
        int ans[] = new int[arr.length];
        int p = 0;
        for(Map.Entry<Integer,List<Integer>> m : map.entrySet()){
            Collections.sort(map.get(m.getKey()));
            List<Integer> temp = map.get(m.getKey());
            for (Integer k :
                    temp) {
                ans[p++] = k.intValue();
            }
        }
        return ans;
    }
}
