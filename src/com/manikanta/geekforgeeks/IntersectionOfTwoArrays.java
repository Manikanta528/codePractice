package com.manikanta.geekforgeeks;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        int b[] = {3, 4, 5, 6, 7};
        int n = a.length, m = b.length;
        int ans = numberOfElementsInIntersection(a,b,n,m);
        System.out.println(ans);
    }
    static int numberOfElementsInIntersection(int[] a,int[] b, int n, int m){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i : a) set1.add(i);
        for(int i : b) set2.add(i);
        set1.retainAll(set2);
        return set1.size();
    }

}
