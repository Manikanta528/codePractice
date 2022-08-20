package com.manikanta.leetcode;


//https://leetcode.com/problems/merge-similar-items/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSimilarItems {
    public static void main(String[] args) {
        int[][] items1 = {{1,1},{4,5},{3,8}};
        int[][] items2 = {{3,1},{1,5}};
        List<List<Integer>> ans = mergeSimilarItems(items1,items2);
        System.out.println(ans);
    }
    private static List<List<Integer>> mergeSimilarItems(int[][] items1,int[][] items2){
        List<List<Integer>> ans = new ArrayList<List<Integer>>() ;
        Arrays.sort(items1,(a,b) -> Integer.compare(a[0],b[0]));
        Arrays.sort(items2,(a,b) -> Integer.compare(a[0],b[0]));
        int i1 = 0, i2 = 0;
        while(i1 != items1.length && i2 != items2.length){
            if(items1[i1][0] == items2[i2][0]){
                List<Integer> list = new ArrayList<>();
                list.add(items1[i1][0]);
                list.add(items1[i1][1]+items2[i2][1]);
                ans.add(list);
                i1++;
                i2++;
            }else if(items1[i1][0] < items2[i2][0]){
                List<Integer> list = new ArrayList<>();
                list.add(items1[i1][0]);
                list.add(items1[i1][1]);
                ans.add(list);
                i1++;
            }else if(items1[i1][0] > items2[i2][0]){
                List<Integer> list = new ArrayList<>();
                list.add(items2[i2][0]);
                list.add(items2[i2][1]);
                ans.add(list);
                i2++;
            }
        }
        while(i1 != items1.length){
            List<Integer> list = new ArrayList<>();
            list.add(items1[i1][0]);
            list.add(items1[i1][1]);
            ans.add(list);
            i1++;
        }
        while(i2 != items2.length){
            List<Integer> list = new ArrayList<>();
            list.add(items2[i2][0]);
            list.add(items2[i2][1]);
            ans.add(list);
            i2++;
        }
        return ans;

    }
}
