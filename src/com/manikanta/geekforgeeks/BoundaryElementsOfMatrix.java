package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/boundary-elements-of-matrix1102/1

import java.util.Arrays;

public class BoundaryElementsOfMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        System.out.println(Arrays.toString(BoundaryElements(matrix)));
    }
    public static int[] BoundaryElements(int[][] matrix)
    {
        // code here
        int len = matrix.length;
        if(len == 1) {
            int res[] = new int[1];
            res[0] = matrix[0][0];
            return res;
        }
        int arr[] = new int[len*4 -4], p = 0;
        for(int i = 0 ; i < len ; i++){
            for(int j = 0 ; j < len ; j++){
                if(i == 0 || i == len -1){
                    arr[p++] = matrix[i][j];
                }else if(j == 0 || j == len -1){
                    arr[p++] = matrix[i][j];
                }
            }
        }
        return arr;
    }
}
