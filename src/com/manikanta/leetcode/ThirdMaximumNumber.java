package com.manikanta.leetcode;

import java.util.Collections;
import java.util.HashSet;

class ThirdMaximumNumber {
    public static void main(String[] args) {
        int nums[] = {1,1,-2147483648};
        int ans = thirdMax(nums);
        System.out.println(ans);
    }
    public static int thirdMax(int[] nums) {
        //hashset method
        HashSet<Integer> set = new HashSet<>();
        for(int v : nums){
            set.add(v);
        }
        if(set.size() > 2){
            set.remove(Collections.max(set));
            set.remove(Collections.max(set));
            return Collections.max(set);
        }
        return Collections.max(set);
        //commit changes
        /* //three var  method
        int n = nums.length;
        if(n == 1) return nums[n-1];
        if(n == 2) return nums[0] > nums[1] ? nums[0] : nums[1];

        long max1 = Long.MIN_VALUE ;
        long max2= Long.MIN_VALUE, max3= Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(max1 < nums[i]){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }else if( max2 < nums[i] && max1 != nums[i]) {
                max3 = max2;
                max2 = nums[i];
            }else if(max3 < nums[i] &&  max1 != nums[i] &&  max2 != nums[i]){
                max3 = nums[i];
            }
            System.out.println(max1+" "+max2+" "+max3);
        }
        if(max3  == Long.MIN_VALUE) return (int)(max1 > max2 ? max1 : max2);
        return (int)max3;
         */
    }
}
