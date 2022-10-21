package com.manikanta.leetcode;

//https://leetcode.com/problems/pascals-triangle-ii/

import java.util.*;

public class PascalsTriangleII {
    public static void main(String[] args) {
        int rowIndex = 33;
        System.out.println(getRow(rowIndex));
    }
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        res.add(list);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        res.add(list2);
        for(int i = 2 ; i <= rowIndex ; i++){
            List<Integer> pt = new ArrayList<>();
            pt.add(1);
            for(int j = 0 ; j < res.get(i-1).size()-1 ; j++){
                pt.add(res.get(i-1).get(j) + res.get(i-1).get(j+1));
            }
            pt.add(1);
            res.add(pt);
        }
        return res.get(rowIndex);

    }
}
