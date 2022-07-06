package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1/?page=2&difficulty[]=0&status[]=unsolved&sortBy=submissions

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class SubArrayWith0Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        boolean ans = findSum(arr,n);
        System.out.println(ans);
    }
    static boolean findSum(int[] arr, int n){
        HashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        int preSum = arr[0];
        map.putIfAbsent(preSum, 0);
        System.out.println(preSum);
        for(int i = 1; i < n; i++){
            if(arr[i] == 0) return true;
            preSum += arr[i];
            //System.out.print(preSum+" ");
            if(map.get(preSum) != null){
                return true;
            }
            map.putIfAbsent(preSum,i);
        }
        //System.out.println(map.toString());
        if(preSum == 0 ) return true;
        return false;
    }
}
