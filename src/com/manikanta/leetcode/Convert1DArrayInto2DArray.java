package com.manikanta.leetcode;

//https://leetcode.com/problems/convert-1d-array-into-2d-array/

import java.util.Arrays;

public class Convert1DArrayInto2DArray {
    public static void main(String[] args) {
        int original[] = {1,2,3,4};
        int m = 2, n = 2;
        int arr[][] = construct2DArray(original, m , n);
        for (int[] i : arr){
            System.out.println(Arrays.toString(i));
        }
    }
    public static int[][] construct2DArray(int[] original , int m , int n){
        if(original.length != m*n){
            return new int[0][0];
        }
        int arr[][] = new int[m][n];
        int p = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = original[p++];
            }
        }
        return arr;
    }
}
