package com.manikanta.geekforgeeks;

import java.util.ArrayList;

//https://practice.geeksforgeeks.org/problems/print-diagonally4331/1

public class PrintDiagonally {
    public static void main(String[] args) {
        int A[][] = {{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        System.out.println(printDiagonally(A.length,A));
    }
    public static ArrayList<Integer> printDiagonally(int N, int[][] A){
        ArrayList<Integer> list = new ArrayList<>();

        // upper triangle
        for(int i = 0 ; i < N ; i++ ){
            int c = i;
            for(int j = 0 ; j <= i ; j++ ){
                list.add(A[j][c--]);
            }
        }

        //bottom triangle
        for(int i = 1 ; i < N ; i++){
            int t = N-1;
            for(int j = 0 ; j < N-i ; j++){
                list.add(A[i+j][t--]);
            }
        }

        return list;
    }
}
