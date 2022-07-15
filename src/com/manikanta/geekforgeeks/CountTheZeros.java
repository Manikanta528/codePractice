package com.manikanta.geekforgeeks;

public class CountTheZeros {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
        int n = arr.length;
        System.out.println(countZeros(arr,n));
    }
    static int countZeros(int[] arr, int n){
        int count = 0;
        if(arr[0] == 0) return n;
        for(int i = n-1; i >= 0 ; i--){
            if(arr[i] == 0) count++;
            else break;
        }
        return count;
    }
}
