package com.manikanta.leetcode;

//https://leetcode.com/problems/duplicate-zeros/

public class DuplicateZeros {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        duplicateZeros(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    private static void duplicateZeros(int[] arr) {
        int n = arr.length;
        for(int i = 0 ; i < n-1; i++){
            if(arr[i] == 0){
                swap(arr,i+1, n-1);
                i=i+1;
            }
        }
    }

    private static void swap(int[] arr,int i, int n) {
        for(int j = n ; j > i; j--){
            arr[j] = arr[j-1];
        }
        arr[i] = 0;
    }
}
