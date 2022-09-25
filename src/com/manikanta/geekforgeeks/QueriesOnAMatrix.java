package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/queries-on-a-matrix0443/1

import java.util.Arrays;

public class QueriesOnAMatrix {
    public static void main(String[] args) {
        int n = 6;
        int Queries[][] = { {4,0,5,3},
                            {0,0,3,4},
                            {1,2,1,2},
                            {1,1,2,3},
                            {0,0,3,1},
                            {1,0,2,4}};
        int arr[][] = solveQueries(n, Queries);
        for(int[] x : arr){
            System.out.println(Arrays.toString(x));
        }
    }
    public static int[][] solveQueries(int n, int[][] Queries) {
        int arr[][] = new int[n][n];
        int len = Queries.length;
        for(int i = 0 ; i < len; i++){
            int t = Queries[i][0], d = Queries[i][2];
            int r = Queries[i][1], l = Queries[i][3];

            for(int j = t ; j <= d; j++){
                for(int k = r ; k <= l ; k++){
                    arr[j][k]++;
                }
            }

        }
        return arr;
    }
}
