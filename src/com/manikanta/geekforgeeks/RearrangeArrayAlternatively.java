package com.manikanta.geekforgeeks;

public class RearrangeArrayAlternatively {
    public static void main(String[] args) {
        long arr[] = {10,20,30,40,50,60,70,80,90,100,110};
        int n = arr.length;
        rearrange(arr,n);
        for(long x : arr){
            System.out.print(x+" ");
        }
    }
    static void rearrange(long arr[], int n){
        int start = 0 , end = n-1;
        long ans[] = new long[n];
        for(int i = 0; i < n; i+=2) {
            ans[i] = arr[end--];
            if(start != end+1) ans[i+1] = arr[start++];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = ans[i];
        }

    }
}
