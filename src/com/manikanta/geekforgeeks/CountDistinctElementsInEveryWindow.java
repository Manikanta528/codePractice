package com.manikanta.geekforgeeks;

import java.util.ArrayList;
import java.util.HashMap;

public class CountDistinctElementsInEveryWindow {
    public static void main(String[] args) {
        int A[] = {1, 2, 1, 3, 4, 2, 3};
        int n = A.length, k = 4;
        ArrayList<Integer> ans = countDistinct(A, n, k);
        System.out.println(ans.toString());
    }

    static ArrayList<Integer> countDistinct(int[] A, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < k; i++) {
            map.putIfAbsent(A[i], 0);
            map.put(A[i], map.get(A[i]) + 1);
        }
        list.add(map.size());
        for(int i = k; i < n ; i++){
            if(map.get(A[i-k]) > 1) map.put(A[i-k],map.get(A[i-k])-1);
            else map.remove(A[i-k]);

            map.putIfAbsent(A[i],0);
            map.put(A[i],map.get(A[i])+1);
            list.add(map.size());
        }
        return list;

    }
}