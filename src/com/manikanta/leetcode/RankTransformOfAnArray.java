package com.manikanta.leetcode;

//https://leetcode.com/problems/rank-transform-of-an-array/

import java.util.Arrays;
import java.util.HashMap;

public class RankTransformOfAnArray {
    public static void main(String[] args) {
        int arr[] = {40,20,10,10,30};
        int ans[] = arrayRankTransform(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] arrayRankTransform(int[] arr) {
        int temp[] = arr.clone();
        Arrays.sort(temp);

        HashMap<Integer,Integer> map = new HashMap<>();
        int p = 1;
        for (int i = 0; i < temp.length ; i++) {
            if(!map.containsKey(temp[i])){
                map.putIfAbsent(temp[i], p++);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
