package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1?page=1&status[]=unsolved&category[]=Arrays&sortBy=submissions
import java.util.HashMap;

public class LargestSubarrayWith0Sum {
    public static void main(String[] args) {
        int arr[] = {-1,1,-1,1},n = arr.length;
        int ans = maxLen(arr,n);
        System.out.println(ans);
    }
    public static int maxLen(int[] arr, int n){

        int sum = 0;
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if(map.containsKey(sum)){
                if(max < i - map.get(sum) ){
                    max = i - map.get(sum);
                }
            }else
                map.put(sum,i);
        }
        return max;
    }
}
