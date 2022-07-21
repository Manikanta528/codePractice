package com.manikanta.geekforgeeks;

public class EvenSubArraySum {
    public static void main(String[] args) {
        int arr[] = {-72,72,3};
        System.out.println(solve(arr.length,arr));
    }
    public static String solve(int N, int[] arr) {
        // code here
        /*
        int sum = 0;
        for(int i = 0 ; i < N ; i++){
            sum = 0;
            System.out.println(i+" ");
            int count = 0;
            for(int j = i ; j < N ; j++){
                sum += arr[j];
                count++;
                if(count == 2){
                    System.out.print(sum+" ");
                    count = 0;
                    if(sum != 0) return "NO";
                }
            }
            System.out.println();
        }
        return "YES";
         */
        int preSum = arr[0]+arr[1];
        if(preSum != 0) return "NO";
        for(int i = 2 ; i < N ; i++){
            preSum += arr[i] - arr[i-2];
            if(preSum != 0) return "NO";
        }
        return "YES";


    }
}
