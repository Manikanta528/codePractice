package com.manikanta.leetcode;

//https://leetcode.com/problems/spiral-matrix/

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> so = new ArrayList<>();
        int rs = 0 ,cs = 0, ce = matrix[0].length-1, re = matrix.length-1  ;
        int len = matrix[0].length * matrix.length;
        while(so.size() < len ){

            // top start -> top end
            for (int i = cs; i <= ce && so.size() < len  ; i++) {
                so.add(matrix[rs][i]);
            }
            //top end +1 -> bottom end
            for(int i = rs+1 ; i <= re && so.size() < len ; i++){
                so.add(matrix[i][ce]);
            }
            //bottom end-1 -> bottom start
            for(int i = ce-1 ;  i >= cs  && so.size() < len ; i--){
                so.add(matrix[re][i]);
            }
            // bottom start-1 -> top start -1
            for(int i = re-1 ; i > rs && so.size() < len ; i--){
                so.add(matrix[i][cs]);
            }
            rs++;re--; cs++; ce--;
        }

        return so;
    }

}
