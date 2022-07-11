package com.manikanta.geekforgeeks;

import java.util.ArrayList;

public class FindPairGivenDifference {
    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 3, 4};
        int size = arr.length,n = 0;
        boolean ans = findPair(arr,size,n);
        System.out.println(ans);

    }
    static boolean findPair(int[] arr, int size,int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i : arr) list.add(i);
        for(int i = 0 ; i < size; i++){
            if(arr[i] > n){
                if(n == 0){
                    int ind = list.indexOf(arr[i]-n);
                    list.remove(ind);
                    if(list.contains(arr[i]-n)) return true;
                    list.add(arr[i]-n);
                    continue;
                }
                if(list.contains(arr[i]-n)) return true;
            }
            else if(arr[i] < n ){
                if(n == 0){
                    int ind = list.indexOf(n-arr[i]);
                    list.remove(ind);
                    if(list.contains(n-arr[i])) return true;
                    list.add(n-arr[i]);
                    continue;
                }
                if(list.contains(n-arr[i])) return true;
            }
        }
        return false;
    }
}
