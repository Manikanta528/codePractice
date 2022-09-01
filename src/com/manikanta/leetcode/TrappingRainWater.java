package com.manikanta.leetcode;

//https://leetcode.com/problems/trapping-rain-water/

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] heights = {4,2,0,3,2,5};
        int ans = trap(heights);
        System.out.println(ans);
    }
    public static int trap(int[] heights){
        int ans = 0,len = heights.length;
        int left[] = new int[len],maxLeft = heights[0];
        int right[] = new int[len],maxRight = heights[len-1];

        for (int i = 0; i < len ; i++) {
            if(maxLeft < heights[i]) maxLeft = heights[i];
            left[i] = maxLeft;
        }
        for (int i = len-1; i >= 0; i--) {
            if(maxRight < heights[i]) maxRight = heights[i];
            right[i] = maxRight;
        }
        for (int i = 0; i < len; i++) {
            ans += Math.min(left[i],right[i]) - heights[i];
        }
        return ans;
    }
}
