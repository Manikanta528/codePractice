package com.manikanta.leetcode;

//https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/

import java.util.Arrays;

public class TheKWeakestRowsInAMatrix {
    public static void main(String[] args) {
        int mat[][] = {
                {1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}
        };
        int k = 3;
        int ans[] = kWeekestRows(mat,k);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] kWeekestRows(int[][] mat, int k) {
        int nSol[] = new int[mat.length];
        int sortInd[] = new int[mat.length];
        int len = mat.length;
        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == 1){
                    count++;
                }else break;
            }
            nSol[i] = count;
        }
        //System.out.println(Arrays.toString(nSol));
        for (int i = 0; i < len; i++) {
            int min = 0;
            for (int j = 0; j < len; j++) {
                if(nSol[min] > nSol[j]){
                    min = j;
                }
            }
            sortInd[i] = min;
            nSol[min] = 101;
        }
        //System.out.println(Arrays.toString(nSol));
        int ans[] = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = sortInd[i];
        }

        return ans ;
    }
}
