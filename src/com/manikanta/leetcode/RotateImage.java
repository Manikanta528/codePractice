package com.manikanta.leetcode;

//https://leetcode.com/problems/rotate-image/

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    public static void rotate(int[][] matrix){
        int len = matrix.length;
        int[][] ans = new int[len][len];
        for (int i = 0; i < len; i++) {
            int ct = len-1;
            for (int j = 0; j < len; j++) {
                //System.out.println(matrix[ct][i]);
                ans[i][j] = matrix[ct--][i];
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                matrix[i][j] = ans[i][j];
            }
        }
    }
}
