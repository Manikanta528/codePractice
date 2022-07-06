package com.manikanta.leetcode;

import java.util.*;


public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int nums1[] = {4,9,5};
        int nums2[] = {9,4,9,8,4};
        int ans[] = intersect(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
    static int[] intersect(int[] nums1, int[] nums2){
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(nums1.length < nums2.length)
           res = getIntersect(nums1, nums2);
        else
            res = getIntersect(nums2, nums1);

        int ans[] = new int[res.size()];
        int i = 0;
        for(Integer k : res)
            ans[i++] = k.intValue();
        return ans;
    }
    static ArrayList<Integer> getIntersect(int[] n1, int[] n2){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for(int i : n1)
            list1.add(i);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i : n2)
            list2.add(i);
        int p = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();

        while ( p < list1.size() && list2.size()!=0){
            if(list2.contains(list1.get(p))){
                res.add(list1.get(p));
                list2.remove(list1.get(p));
            }
            p++;
        }
        return res;
    }
}
