package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/key-pair5616/1/?page=3&difficulty[]=0&status[]=unsolved&sortBy=submissions

import java.util.*;

public class KeyPair {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 6, 7};
        int n = arr.length,x = 4;
        System.out.println(hasArrayTwoCanditates(arr,n,x));
    }
    static boolean hasArrayTwoCanditates(int[] arr, int n , int x){
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i : arr){
            map.putIfAbsent(i,0);
            map.put(i,map.get(i)+1);
        }
        for(int i : arr){
            int diff = x - i;
            if(map.containsKey(diff)){
                if(diff == i && map.get(diff) > 1)
                    return true;
                else if(diff != i && map.get(diff) > 0)
                    return true;
            }
        }
        return false;
    }
}
