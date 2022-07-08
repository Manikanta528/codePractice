package com.manikanta.geekforgeeks;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {4, 1, 3, 9, 7};
        int n = arr.length;
        bubbleSort(arr,n);
        for(int k : arr){
            System.out.print(k+" ");
        }
    }
    static  void  bubbleSort(int[] arr, int n){
        int temp ;
        for(int i = 0 ; i < n-1; i++){
            for(int j = 0; j < n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
