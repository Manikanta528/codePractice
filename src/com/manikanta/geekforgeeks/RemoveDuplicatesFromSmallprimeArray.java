package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/remove-duplicates-in-small-prime-array/1?page=1&status[]=unsolved&category[]=Prime%20Number&sortBy=submissions

import java.util.ArrayList;
import java.util.Arrays;

class RemoveDuplicatesFromSmallprimeArray
{

    public static void main(String[] args) {
        int arr[] = {2,2,3,3,7,5};
        int n = arr.length;
        System.out.println(removeDuplicate(arr,n));
    }
    static ArrayList<Integer> removeDuplicate(int arr[], int n)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int v : arr){
            if(!list.contains(v)) list.add(v);
        }
        return list;
    }
}