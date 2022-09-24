package com.manikanta.leetcode;

//https://leetcode.com/problems/sort-colors/

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        mergeInSort(nums, 0, nums.length);
    }
    public static void mergeInSort(int[] nums, int s, int e){
        if(e-s == 1){
            return;
        }

        int m = (s+e)/2;
        mergeInSort(nums, s, m);
        mergeInSort(nums, m, e);

        merge(nums, s, m , e);
    }
    public static void merge(int[] nums , int s , int m , int e){
        int[] mix = new int[e-s];
        int i = s,j = m, k = 0;

        while(i < m && j < e){
            if(nums[i] < nums[j]){
                mix[k] = nums[i];
                i++;
                k++;
            }else{
                mix[k] = nums[j];
                j++;
                k++;
            }
        }

        while(i < m){
            mix[k] = nums[i];
            i++;
            k++;
        }
        while(j != e){
            mix[k] = nums[j];
            j++;
            k++;
        }

        for(int l = 0 ; l < mix.length; l++){
            nums[s+l] = mix[l];
        }

    }
}
