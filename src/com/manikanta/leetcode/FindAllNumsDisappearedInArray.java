package com.manikanta.leetcode;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllNumsDisappearedInArray {
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        List<Integer> list = findDisappearedNumbers(nums);
        System.out.println( list);
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<>();
        for(int v : nums){
            set.add(v);
        }
        for (int i = 1; i <= n ; i++) {
            if(!set.contains(i)) list.add(i);
        }
        return list;
    }
}
