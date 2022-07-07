package com.manikanta.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int mat[][] = {{1,2},{3,4}};
        int r = 1,c=4;
        int res[][] = matrixReshape(mat,r,c);
        for(int i = 0 ; i < r; i++){
            for(int j = 0 ; j < c; j++){
                System.out.print(res[i][j]);
            }
            System.out.println();
        }

    }
    static int[][] matrixReshape(int[][] mat,int r,int c){
        int r1 = mat.length,c2 = mat[0].length;
        if(r1*c2 != r*c) return mat;

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < r1; i++){
            for(int j = 0 ; j < c2; j++){
                list.add(mat[i][j]);
            }
        }
        int res[][] = new int[r][c];
        int p = 0;
        for(int i = 0 ; i < r; i++){
            for(int j = 0 ; j < c; j++){
                res[i][j] = list.get(p++);
            }
        }
        return res;
    }
}
