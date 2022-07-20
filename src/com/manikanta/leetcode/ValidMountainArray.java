package com.manikanta.leetcode;

//https://leetcode.com/problems/valid-mountain-array/

class ValidMountainArray {
    public static void main(String[] args) {
        int arr[] ={0,2,3,4,6,3,2,1};
        System.out.println(validMountainArray(arr));
    }
    public static boolean validMountainArray(int[] arr) {
        int len = arr.length;
        if(len < 3) return false;
        int s = 0 , e = len -1;
        while( s < len-2 && arr[s] < arr[s+1] ){
            s++;
        }
        while(e > 0 && arr[e-1] > arr[e] ){
            e--;
        }
        //System.out.println(s+" "+e);
        if(s == e && s != 0 && e != len-1)
            return true;
        return false;
    }
}