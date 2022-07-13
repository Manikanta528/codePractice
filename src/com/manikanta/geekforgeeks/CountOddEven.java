package com.manikanta.geekforgeeks;

public class CountOddEven {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        countOddEven(arr,arr.length);
    }
    static void countOddEven(int arr[],int n){
        int odd= 0, even=0;
        for(int i : arr){
            if(i%2 == 0) even++;
            else odd++;
        }
        System.out.println(odd+" "+even);
    }
}
