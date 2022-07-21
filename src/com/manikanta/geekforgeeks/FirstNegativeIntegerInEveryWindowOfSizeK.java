package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1?page=1&category[]=two-pointer-algorithm&sortBy=submissions

import java.util.ArrayList;

public class FirstNegativeIntegerInEveryWindowOfSizeK {
    public static void main(String[] args) {
        long A[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int N = A.length;
        int K = 3;
        long ans[] = printFirstNegativeInteger(A,N,K);
        for (long v :
                ans) {
            System.out.print(v+" ");
        }
    }
    public static long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        ArrayList<Long> list = new ArrayList<Long>();
        for(int i  = 0 ; i <= N-K; i++){
            int flag = 0;
            for(int j = i ; j < i+K; j++){
                if(A[j] < 0){
                    flag++;
                    list.add(A[j]);
                    break;
                }
            }
            if(flag == 0) list.add(new Long(0));
        }
        long ans[] = new long[list.size()];
        int p = 0;
        for(Long v : list){
            ans[p++] = v.longValue();
        }
        return ans;
    }
}
