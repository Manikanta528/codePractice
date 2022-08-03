package com.manikanta.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class RelativeSortArray {
    public static void main(String[] args) {
        int arr1[] = {2,3,1,3,2,4,6,7,9,2,19};
        int arr2[] = {2,1,4,3,9,6};
        int ans[] = relativeSortArray(arr1,arr2);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2){
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int i = 0 ; i < arr2.length; i++){
            map1.putIfAbsent(arr2[i],i);
        }
        for (int i = 0; i < arr1.length; i++) {
            map.putIfAbsent(arr1[i],0);
            map.put(arr1[i], map.get(arr1[i])+1);
        }
        int ans[] = new int[arr1.length];
        int p = 0;
        for (int i = 0; i < arr2.length; i++) {
            int t = arr2[i];
            int len = map.get(t).intValue();
            while(len-- > 0) {
                ans[p++] = t;
            }
        }
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            if(p == arr1.length) break;
            int t = arr1[i];
            if(map1.get(t) == null){
                ans[p++] = t;
            }
        }
        return ans;

    }
}
