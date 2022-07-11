package com.manikanta.geekforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {1,35};
        int arr2[] = {6,9,13, 15 ,20, 25, 29, 46};
        int n = arr1.length,m = arr2.length;
        ArrayList<Integer> ans = findUnion(arr1,arr2,n,m);
        System.out.println(ans.toString());
    }
    static ArrayList<Integer> findUnion(int[] arr1 , int[] arr2, int n , int m){
        HashSet<Integer> set1 = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i : arr1) set1.add(i);
        for(int i : arr2) set1.add(i);
        for(Integer k : set1){
            ans.add(k);
        }
        Collections.sort(ans);
        return ans;
    }
}
