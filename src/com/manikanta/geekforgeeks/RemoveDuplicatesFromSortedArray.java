package com.manikanta.geekforgeeks;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int A[] = {1,2,3,5,5};
        int N = A.length;
        int ans = remove_duplicates(A,N);
        for(int i = 0 ; i < ans; i++){
            System.out.print(A[i]+" ");
        }
    }
    static int remove_duplicates(int[] A, int N){
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0 ; i < N-1; i++){
            if(A[i] != A[i+1]){
                count++;
                arr.add(A[i]);
            }
        }
        if(!arr.contains(A[N-1])) arr.add(A[N-1]);
        for(int i = 0; i < arr.size(); i++){
            A[i] = arr.get(i);
        }
        return count+1;
    }
}
