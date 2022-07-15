package com.manikanta.geekforgeeks;

public class BitnoicPoint {
    public static void main(String[] args) {
        int arr[] = {1,15,25,45,42,21,17,12,11};
        int n = arr.length;
        System.out.println(findMax(arr,n));
    }

    private static int findMax(int[] arr, int n) {
        int max = arr[0];
        for(int i = 1 ; i < n; i++){
            if(arr[i] > arr[i-1]) max = arr[i];
            else break;
        }
        return max;
    }
}
