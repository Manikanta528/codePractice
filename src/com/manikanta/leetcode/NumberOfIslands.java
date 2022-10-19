package com.manikanta.leetcode;

//https://leetcode.com/problems/number-of-islands/?envType=study-plan&id=level-1

public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {{'1','1','0','0','0'},
                        {'1','1','0','0','0'},
                        {'0','0','1','0','0'},
                        {'0','0','0','1','1'}};
        System.out.println(numIslands(grid));
    }
    public static int numIslands(char[][] grid) {
        int n = grid.length, m = grid[0].length, count = 0;

        for(int i = 0 ; i < n ; i++ ){
            for(int j = 0 ; j < m ; j++){
                if(grid[i][j] == '1'){
                    islandHelper(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void islandHelper(char[][] grid , int r, int c){
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != '1') return ;
        grid[r][c] = '0';
        islandHelper(grid, r+1, c);
        islandHelper(grid, r-1, c);
        islandHelper(grid, r, c+1);
        islandHelper(grid, r, c-1);

    }
}
