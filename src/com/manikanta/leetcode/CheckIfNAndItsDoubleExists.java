package com.manikanta.leetcode;

//https://leetcode.com/problems/check-if-n-and-its-double-exist/

public class CheckIfNAndItsDoubleExists {
    public static void main(String[] args) {
        int arr[] = {10,2,5,3};
        System.out.println(checkIfExists(arr));
    }
    private static boolean checkIfExists(int[] arr) {
        int len = arr.length;
        for(int i = 0 ; i < len; i++){
            int N = arr[i]*2;
            for(int j = 0; j < len ; j++){
                if(arr[j] == N && j!=i) return true;
            }
        }
        return false;
    }
}
