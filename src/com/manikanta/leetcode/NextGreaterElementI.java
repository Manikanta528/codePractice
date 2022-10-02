package com.manikanta.leetcode;

//https://leetcode.com/problems/next-greater-element-i/

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class NextGreaterElementI {
    public static void main(String[] args) {
        int nums1[] = {4,1,2}, nums2[] = {1,3,4,2};
        int ans[] = nextGreaterElement(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int ans[] = new int[n];
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i = 0 ; i < m ; i++){
            map.put(nums2[i], i);
        }
        for(int i = 0 ; i < n ; i++ ){
            int s = map.get(nums1[i]);
            ans[i] = linearSearch(nums2, s, m);
        }
        return ans;
    }
    public static int linearSearch(int[] nums2 , int s , int e){
        int val = nums2[s];
        for(int i = s ; i < e; i++){
            if(val < nums2[i]){
                return nums2[i];
            }
        }
        return -1;
    }
}
