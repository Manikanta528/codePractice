package com.manikanta.leetcode;

//https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/

import java.util.HashMap;

public class MakeTwoArraysEqualByReversingSubarrays {
    public static void main(String[] args) {
        int target[] = {1,2,3,4};
        int arr[] = {2,4,1,3};
        System.out.println(canBeEqual(target,arr));
    }
    public static boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> mapTarget = new HashMap<>();
        HashMap<Integer,Integer> mapArr = new HashMap<>();
        for(int i : target){
            mapTarget.putIfAbsent(i,0);
            mapTarget.put(i,mapTarget.get(i)+1);
        }
        for(int i : arr){
            mapArr.putIfAbsent(i,0);
            mapArr.put(i,mapArr.get(i)+1);
        }
        if(mapArr.size() != mapTarget.size()) return false;
        for(int i : target){
            if(mapArr.get(i) != mapTarget.get(i) ) return false;
        }
        return true;
    }
}

