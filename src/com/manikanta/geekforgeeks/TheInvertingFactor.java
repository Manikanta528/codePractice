package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/the-inverting-factor3932/1?page=1&category[]=Reverse&sortBy=submissions

import java.util.Arrays;

class TheInvertingFactor{

    public static void main(String[] args) {
        int arr[] = {26,15,45,150};
        int n = arr.length;
        System.out.println(findMinimumInvertingFactor(arr,n));
    }
    // Function for finding maximum and value pair
    public static int findMinimumInvertingFactor (int arr[], int n) {
        //Complete the function
        for(int i = 0 ; i < n; i++){
            reverse(arr,i);
        }
        Arrays.sort(arr);
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]+" ");
//        }
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < n-1 ; i++){
            if(min > Math.abs(arr[i]-arr[i+1]) ) min = Math.abs(arr[i]-arr[i+1]);
        }
        return min;
    }
    static void reverse(int arr[],int pos){
        int temp = arr[pos];
        int ans = 0,rem;
        while(temp > 0){
            rem = temp%10;
            ans = ans*10 + rem;
            temp/=10;
        }
        arr[pos] = ans;
    }
    
    
}