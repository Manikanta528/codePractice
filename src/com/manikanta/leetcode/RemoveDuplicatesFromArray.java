package com.manikanta.leetcode;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        int ans = removeDuplicates(nums);
        for (int i = 0; i < ans; i++) {
            System.out.print(nums[i] +" ");
        }
    }

    private static int removeDuplicates(int[] nums) {
        // HashSet<Integer> set = new LinkedHashSet<>();
        // for(int i : nums){
        //     set.add(i);
        // }
        // int k = 0;
        // for(Integer i : set){
        //     nums[k++] = i;
        // }
        // return set.size();
        int n = nums.length, count = 0,s=0,p = 1;
        while(p < n-count){
            if(nums[s] == nums[p]){
                for(int i = p ; i < n-1 ; i++){
                    nums[i] =  nums[i+1];
                }
                count++;
                if(nums[s] != nums[p]){
                    s++;
                    p++;
                }
            }else{
                s++;
                p++;
            }
        }
        return n-count;
    }
}
