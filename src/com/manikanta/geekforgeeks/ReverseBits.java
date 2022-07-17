package com.manikanta.geekforgeeks;

//https://practice.geeksforgeeks.org/problems/reverse-bits3556/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Bit%20Magic&sortBy=submissions

public class ReverseBits {
    public static void main(String[] args) {
        Long X = new Long(1);
        System.out.println(reverseBits(X));
    }
//10000000000000000000000000000000
//10000000000000000000000000000000
    private static Long reverseBits(Long X) {
        String str ="";
        long ans = 0;
        if(X == 0) return new Long(0);
        while(X>0){
            str += (X&1) == 0? 0:1;
            X>>=1;
        }
        for(int i= str.length(); i < 32 ; i++){
            str+="0";
        }
        int p = 0;
        for(int i = 31 ; i >= 0 ; i--){
            if(str.charAt(i) == '1'){
                ans += (long)Math.pow(2,p);
            }
            p++;
        }
        return new Long(ans);

        //Brute force
//        String str = Long.toBinaryString(X);
////        String rev = "";
////        long ans = 0 ;
////        for(int i = str.length()-1; i >= 0 ; i-- ){
////            rev += str.charAt(i);
////        }
////        for(int i = str.length(); i < 32 ; i++){
////            rev += "0";
////        }
////        int p = 0;
////        for(int i = 31 ; i >= 0 ; i--){
////            if(rev.charAt(i) == '1'){
////                ans += (long)Math.pow(2,p);
////            }
////            p++;
////        }
////        return new Long(ans);

    }
}
