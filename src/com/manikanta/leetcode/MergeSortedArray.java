package com.manikanta.leetcode;

//https://leetcode.com/problems/merge-sorted-array/

public class MergeSortedArray {
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int m= 3;
        int nums2[] = {2,5,6};
        int n = 3;
        mergeSortedArray(nums1,m,nums2,n);
        for(int i : nums1){
            System.out.print(i+" ");
        }
    }

    private static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int p = m+n-1, t1 = m -1, t2 = n-1;
        while(t2 >= 0){
            if(t1 >= 0 && nums1[t1] > nums2[t2]){
                nums1[p--] = nums1[t1--];
            }else {
                nums1[p--] = nums2[t2--];
            }
        }
    }
}
