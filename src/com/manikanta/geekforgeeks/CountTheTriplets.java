package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/count-the-triplets4615/1/?page=2&difficulty[]=0&status[]=unsolved&sortBy=submissions#


import java.util.HashSet;

public class CountTheTriplets {
    public static void main(String[] args) {
        int arr[] = {6,14,3 ,6,8,11,16};
        int n = arr.length;
        int ans = countTriplets(arr,n);
        System.out.println(ans);
    }
    static int countTriplets(int arr[],int n){
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(set.contains(arr[i]+arr[j])) count++;
            }
        }
        return count;
    }
}
