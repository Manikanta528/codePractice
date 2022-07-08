package com.manikanta.geekforgeeks;

import java.util.Scanner;

public class FindMissingAndRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans[] = findTwoElements(arr,n);
        System.out.println(ans[0]+" "+ans[1]);
    }
    static int[] findTwoElements(int[] arr, int n){
        int temp[] = new int[n+1];
        int ans[] = new int[2];
        for(int i = 0 ; i < n ; i++){
            temp[arr[i]]++;
            if(temp[arr[i]] == 2) ans[0] = arr[i];
        }
        for (int i = 1; i < n+1; i++) {
            if(temp[i] == 0){
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}
