package com.manikanta.leetcode;

//https://leetcode.com/problems/minimum-absolute-difference/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int arr[] = {3,8,-10,23,19,-4,-14,27};
        System.out.println(minimumDifference(arr));
    }
    public static List<List<Integer>> minimumDifference(int[] arr){
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            if(minDiff > arr[i+1] - arr[i]){
                minDiff = arr[i+1] - arr[i];
            }
        }
        List<List<Integer>> out = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            if(minDiff == arr[i+1] - arr[i]){
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i+1]);
                out.add(list);
            }
        }
        return out;
    }
}
