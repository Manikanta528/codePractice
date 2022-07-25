package com.manikanta.geekforgeeks;

public class SearchInAMatrix {
    public static void main(String[] args) {
        int mat [][] = {{3,30,38 },{44,52,54},{57,60,69}};
        int N = mat.length,M = mat[0].length,X = 44;
        int ans = matSearch(mat, N,M,X);
        System.out.println(ans);
    }
    public static int matSearch(int mat[][], int N, int M, int X) {
        // your code here
        for (int i = 0; i < N; i++) {
            int s = 0,e = M-1;
            if(mat[i][s] <= X && mat[i][e] >= X){
                for(int j = 0 ; j < M ; j++){
                    if(mat[i][j] == X) return 1;
                }
            }
        }
        return 0;
    }
}
