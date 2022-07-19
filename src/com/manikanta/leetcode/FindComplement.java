package com.manikanta.leetcode;

class FindComplement {
    public static void main(String[] args) {
        int num = 27;
        System.out.println(findComplement(num));
    }
    public static int findComplement(int num) {
        int ans = 0,p=0;
        while(num > 0){
           
            if((num&1) == 0){
                ans += (int)Math.pow(2,p);
            }
            p++;
            num>>=1;
        }
        return ans;
    }
}