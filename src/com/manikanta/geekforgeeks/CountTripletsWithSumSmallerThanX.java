package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1?page=1&category[]=two-pointer-algorithm&sortBy=submissions
import java.util.Arrays;

class CountTripletsWithSumSmallerThanX
{
    public static void main(String[] args) {
        long arr[] = {5, 1, 3, 4, 7};
        int n = arr.length,sum = 12;
        long ans = countTriplets(arr,n,sum);
        System.out.println(ans);
//        18 86
//        30 8 23 6 10 9 31 7 19 20 1 33 21 27 28 3 25 26
    }
    static long countTriplets(long arr[], int n,int sum)
    {
        Arrays.sort(arr);
        long count = 0;
        for (int i = 0; i < n-2; i++) {
            int j = i+1,k = n-1;
            while(j < k){
                if(arr[i]+arr[j]+arr[k] >= sum){
                    k--;
                }else{
                    count += k - j;
                    j++;
                }
            }

        }
        return count;


        /*
        //brute force
        long count = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i+1; j < n - 1; j++) {
                for (int k = j+1; k < n; k++) {
                    if(arr[i]+arr[j]+arr[k] < sum) count++;
                }
            }
        }
        return count;
         */
    }
}