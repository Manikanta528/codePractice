package com.manikanta.leetcode;

//https://leetcode.com/problems/height-checker/

import java.util.Arrays;

class HeightChecker {
    public static void main(String[] args) {
        int heights[] = {1,1,4,2,1,3};
        int ans = heightChecker(heights);
        System.out.println(ans);
    }
    public static int heightChecker(int[] heights) {
        int n = heights.length;
        int expected[] = heights.clone();
        Arrays.sort(expected);
        int count= 0;
        for (int i = 0; i < n; i++) {
            if(heights[i] != expected[i]) count++;
        }
        return count;
    }
}