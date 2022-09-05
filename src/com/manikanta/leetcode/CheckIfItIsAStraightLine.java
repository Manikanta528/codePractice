package com.manikanta.leetcode;

//https://leetcode.com/problems/check-if-it-is-a-straight-line/

public class CheckIfItIsAStraightLine {
    public static void main(String[] args) {
        int coordinates[][] = {{1,2},{2,3},{3,5}};
        boolean ans = checkStraightLine(coordinates);
        System.out.println(ans);
    }

    private static boolean checkStraightLine(int[][] coordinates) {
        boolean ans = true;
        if(coordinates.length == 2)return ans;
        int len = coordinates.length;

        for (int i = 0; i <= len-3 ; i++) {
            //collinearity formula of straight line
            if( ( coordinates[i][0]*(coordinates[i+1][1] -coordinates[i+2][1]) + coordinates[i+1][0]*(coordinates[i+2][1] -coordinates[i][1]) +coordinates[i+2][0]*(coordinates[i][1] -coordinates[i+1][1]) )!= 0){
                return false;
            }
        }
        return ans;
    }
}
