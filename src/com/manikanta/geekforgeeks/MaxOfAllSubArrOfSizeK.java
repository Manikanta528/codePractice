package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1/?page=8&sortBy=submissions

import java.util.ArrayList;
import java.util.Collections;

public class MaxOfAllSubArrOfSizeK {
    public static void main(String[] args) {

        int arr[] = {8,5,10,7,9,4,15,12,90,13};
        int k = 4,n = arr.length;
        ArrayList<Integer> ans = max_of_subarrays(arr,n,k);
        System.out.println(ans.toString());
    }
    static ArrayList<Integer> max_of_subarrays(int[] arr, int n , int k){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ArrayList<Integer> queue = new ArrayList<Integer>();
        for (int i = 0; i < k; i++) {
            queue.add(arr[i]);
        }
        ans.add(Collections.max(queue));
        for(int i = k ; i < n; i++){
            queue.remove(0);
            queue.add(arr[i]);
            ans.add(Collections.max(queue));
        }
        return ans;
    }
}
