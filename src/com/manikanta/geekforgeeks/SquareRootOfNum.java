package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/square-root/1/?page=4&sortBy=submissions

import java.util.ArrayList;

public class SquareRootOfNum {
    public static void main(String[] args) {
        long x = 10000000;
        long ans = floorSqrt(x);
        System.out.println(ans);
    }
    static long floorSqrt(long x){

        long t = 1;
        while(true){
            if(t*t <= x){
                t++;
            }
            else{
                break;
            }
        }
        return t-1;

    }
}
