package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/common-elements1132/1/?page=1&difficulty[]=0&status[]=unsolved&sortBy=submissions#

import java.util.ArrayList;

public class CommonElements {
    public static void main(String[] args) {
        int A[] = {1, 5, 10, 20, 40, 80};
        int B[] = {6, 7, 20, 80, 100};
        int C[] = {3, 4, 15, 20, 30, 70, 80, 120};
        int n1 = 6, n2 = 5 , n3 = 8;
        ArrayList<Integer> ans = commonElements(A,B,C,n1,n2,n3);
        System.out.println(ans.toString());
    }
    static ArrayList<Integer> commonElements(int[] A,int[] B, int[] C, int n1 , int n2, int n3){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 0 ; i < n1; i++){
            int temp = A[i];
            int count = 0;
            int t1 = binarySearch(B,temp);
            int t2 = binarySearch(C,temp);
            if(t1 == 1 && t2 == 1) count++;
            if(count > 0 && !ans.contains(temp))
                ans.add(temp);
        }

        return ans;
    }
    static int binarySearch(int[] arr, int key){
        int start = 0, end = arr.length -1;
        int mid ;
        while(start <= end){
            mid = start + (end - start)/2;
            if(arr[mid] == key ){
                return 1;
            }
            else if( arr[mid] < key) start = mid +1;
            else end = mid - 1;
        }
        return 0;
    }
}
