package com.manikanta.leetcode;

//https://leetcode.com/problems/intersection-of-multiple-arrays/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfMultipleArrays {
    public static void main(String[] args) {
        int nums[][] = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        List<Integer> list = intersection(nums);
        System.out.println(list);
    }
    public static List<Integer> intersection(int[][] nums){
        List<Integer> list = new ArrayList<>();
        if(nums.length == 1 ){
            for(int i : nums[0]){
                list.add(i);
            }
            Collections.sort(list);
            return list;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int arrLen = nums.length;
        int len = nums[0].length;
        for (int i = 0; i < len; i++) {
            map.put(nums[0][i], 1);
        }
        for (int i = 1; i < arrLen; i++) {
            int l = nums[i].length;
            for (int j = 0; j < l; j++) {
                if(map.containsKey(nums[i][j])){
                    map.put(nums[i][j], map.get(nums[i][j])+1);
                    if(i == arrLen-1){
                        if(map.get(nums[i][j]) == arrLen){
                            list.add(nums[i][j]);
                        }
                    }
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}
