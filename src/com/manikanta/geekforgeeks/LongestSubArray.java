package com.manikanta.geekforgeeks;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LongestSubArray{
    public static void main(String[] args) {
//        23
//        0 1 1 0 0 0 0 1 0 1 1 1 0 0 1 0 0 0 0 0 1 0 0

        int arr[] ={0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1 ,0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0};

        int N = arr.length;
        System.out.println(maxLen(arr,N));
    }
    static int maxLen(int[] arr,int N){
        // brute froce
        /*int count0,count1;
        int maxlen = Integer.MIN_VALUE;
        for(int i = 0 ; i < N-1; i++){
            count0 = 0;
            count1 = 0;
            for(int j = i; j < N ; j++){
                if(arr[j] == 0) count0++;
                else count1++;
                if(count0 == count1){
                    if( maxlen < j - i) maxlen = j - i+1;
                }
            }
        }
        return maxlen;*/


        int maxlen = 0, tempSum = 0;

        for(int  i = 0 ; i < N; i++){
            if(arr[i] == 0) arr[i] = -1;
            tempSum += arr[i];
        }
        if(tempSum == 0) return N;

        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        int sum = 0;
        for(int  i = 0 ; i < N; i++){
            sum += arr[i];

            if(sum == 0){
                maxlen = i+1;
            }
            if(map.get(sum) != null){
                if(maxlen < i -map.get(sum)){
                    maxlen = i - map.get(sum);

                }
            }else{
                map.put(sum, i);
            }

        }
        //if(tempMaxlen > maxlen) return tempMaxlen;
        return maxlen;
    }
}
