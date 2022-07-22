package com.manikanta.geekforgeeks;

public class LCMAndGCD {
    public static void main(String[] args) {
        long A= 14 ,B = 8;
        Long ans[] = lcm_gcd(A,B);
        System.out.println(ans[0]+" "+ ans[1]);
    }
    static Long[] lcm_gcd(long A, long B){
        Long ans[] = new Long[2];
        long d = gcd(A,B);
        ans[0] = A * B / d;
        ans[1] = d;
        return ans;
    }
    static long gcd(long A, long B){
        if(A == 0){
            return B;
        }
        return gcd(B%A, A);
    }
}
