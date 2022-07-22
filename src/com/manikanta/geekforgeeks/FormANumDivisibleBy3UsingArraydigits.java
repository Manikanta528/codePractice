package com.manikanta.geekforgeeks;

public class FormANumDivisibleBy3UsingArraydigits {
    public static void main(String[] args) {
        int arr[] = {40,50,90};
        int N = arr.length;
        System.out.println(isPossible(N,arr));
    }
    static int isPossible(int N, int arr[]) {
        // code here
        int sum = 0,rem;
        for(int i = 0 ; i < N ; i++){
            int v = arr[i];
            while(v>0){
                rem = v%10;
                sum += rem;
                v/=10;
            }
        }
        if(sum%3 == 0) return 1;
        return 0;
    }
}
