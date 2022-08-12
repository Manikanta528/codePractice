package com.manikanta.leetcode;

//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

public class CountNegatives {
    public static void main(String[] args) {
        int grid[][] ={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int ans = countNegatives(grid);
        System.out.println(ans);
    }

    private static int countNegatives(int[][] grid) {
        int count = 0;
        int n = grid.length,m = grid[0].length;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j] < 0) count++;
            }
        }
        return count;
    }

}
