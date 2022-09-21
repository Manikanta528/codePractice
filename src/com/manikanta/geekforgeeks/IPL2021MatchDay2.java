package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/deee0e8cf9910e7219f663c18d6d640ea0b87f87/1

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class IPL2021MatchDay2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,4,5,2,3,6};
        int n = arr.length, k = 3;
        ArrayList<Integer> list = max_of_subarray(arr, n , k);
        System.out.println(list);
    }
    public static ArrayList<Integer> max_of_subarray(int[] arr , int n , int k){
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();
        int max = 0;
        for (int i = 0; i < k; i++) {
            queue.add(arr[i]);
            if(max < arr[i]) max = arr[i];
        }
        list.add(max);
        for (int i = k; i < n; i++) {
            queue.add(arr[i]);
            int rem = queue.remove();
            if(arr[i] > max){
                max = arr[i];
            }
            if(max == rem){
                max = 0;
                for(Integer item : queue){
                    if(max < item) max = item;
                }
            }
            //System.out.println(queue);
            list.add(max);
        }
        return list;
    }
}
