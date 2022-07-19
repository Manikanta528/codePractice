package com.manikanta.geekforgeeks;

class Segregate0sAnd1s {
    public static void main(String[] args) {
        int arr[] = {1,0,0,1,1};
        int n = arr.length;
        segregate0and1(arr,n);
        for(int v : arr) System.out.print(v+" ");

    }
    static void segregate0and1(int[] arr, int n) {
        // code here
        int count = 0;
        for(int i= 0 ; i < n ; i++){
            if(arr[i] == 1 ){
                count++;
                arr[i] = 0;
            }
        }
        int p = n-1;
        while(count-- > 0){
            arr[p--] = 1;
        }
    }

}