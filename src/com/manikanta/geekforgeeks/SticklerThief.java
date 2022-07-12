package com.manikanta.geekforgeeks;

public class SticklerThief {
    public static void main(String[] args) {
        int arr[] = {5,5,10,100,10,5};
        int n = arr.length;
        int ans = findMaxSum(arr,n);
        System.out.println(ans);
    }
    static int findMaxSum(int[] arr,int n){
        int evenSum = 0 , oddSum = 0;
        for (int i = 0; i < n; i++) {
            if(i%2 == 0){
                evenSum = Math.max(evenSum+arr[i],oddSum);
            }
            else{
                oddSum = Math.max(oddSum+arr[i],evenSum);
            }
        }
        return Math.max(evenSum,oddSum);
    }
}
