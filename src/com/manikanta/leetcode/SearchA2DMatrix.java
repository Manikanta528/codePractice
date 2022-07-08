package com.manikanta.leetcode;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 4;
        boolean ans = searchMatrix(matrix,target);
        System.out.println(ans);
    }
    static boolean searchMatrix(int[][] matrix,int target){
        int len = matrix.length;
        int start,end,mid;
        for (int i = 0; i < len; i++) {
            start = 0;
            end = matrix[i].length-1;
            if(matrix[i][start] <= target && matrix[i][end] >= target ){
                while (start <= end){
                    mid = start+(end-start)/2;
                    if(matrix[i][mid] == target) return true;
                    else if(matrix[i][mid] < target) start = mid + 1;
                    else  end = mid -1;
                }
                break;
            }
        }
        return false;
    }
}
