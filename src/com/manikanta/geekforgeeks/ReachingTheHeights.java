package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/reaching-the-heights1921/1#

import java.util.ArrayList;
import java.util.Arrays;


public class ReachingTheHeights {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3};
        int n = arr.length;
        ArrayList<Integer> ans = reaching_height(n,arr);
        System.out.println(ans.toString());
    }
    static ArrayList<Integer> reaching_height(int n , int arr[]){
        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if( n == 2 && arr[0] == arr[1] ){
            ans.add(-1);
            return ans;
        }
        int start = 0 ,end = n-1;
        for (int i = 0; i < n ; i+=2) {
            ans.add(arr[end--]);
            if(i+1 < n) ans.add(arr[start++]);
        }
        return ans;
    }
}
