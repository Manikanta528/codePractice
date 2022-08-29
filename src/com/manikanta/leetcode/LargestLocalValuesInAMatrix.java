package com.manikanta.leetcode;

//https://leetcode.com/problems/largest-local-values-in-a-matrix/

import java.util.Arrays;

public class LargestLocalValuesInAMatrix {
    public static void main(String[] args) {
        int grid[][] = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        int ans[][] = largestLocal(grid);

        for (int i = 0; i < ans.length; i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }
    public static int[][] largestLocal(int[][] grid){
        int len = grid.length;
        int ans[][] = new int[len-2][len-2];

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < len-2; j++) {
                int max = Integer.MIN_VALUE;
                for (int k = i; k < i+3; k++) {
                    for (int l = j; l < j+3; l++) {
                        if(grid[k][l] > max) max = grid[k][l];
                    }
                }
                ans[i][j] = max;
            }

        }
        return ans;
    }
}
