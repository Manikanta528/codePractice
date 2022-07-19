package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/plus-one/1?page=4&difficulty[]=0&status[]=unsolved&sortBy=submissions

import java.util.ArrayList;
import java.util.Arrays;

class PlusOne {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(9,9,9));
        int N = arr.size();
        System.out.println(increment(arr,N));
    }
    public static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
        // code here
        int carry = 1;
        int sum;
        if(arr.get(N-1) != 9){
            arr.set(N-1,arr.get(N-1)+1);
            return arr;
        }
        for(int i = N-1 ; i >= 0 ; i--){
            sum = carry+arr.get(i);
            if(sum > 9){
                carry = 1;
                arr.set(i,sum%10);
            }else{
                carry = 0;
                arr.set(i, sum);
                break;
            }
        }
        if(carry == 1) arr.add(0,1);
        return arr;
    }
};