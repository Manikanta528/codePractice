package com.manikanta.leetcode;

//https://leetcode.com/problems/reduce-array-size-to-the-half/

import java.util.*;

public class ReduceArraySizeToTheHalf {
    public static void main(String[] args) {
        int arr[] = {3,3,3,3,5,5,5,2,2,7};
        int ans = minSetSize(arr);
        System.out.println(ans);
    }
    static public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int actlen = arr.length;
        for(int i : arr){
            map.putIfAbsent(i,0);
            map.put(i,map.get(i)+1);
        }
        if(map.size() == 1) return 1;
        List<Integer>[] set = new ArrayList[actlen];
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(set[m.getValue()] == null){
                set[m.getValue()] = new ArrayList<>();
            }
            set[m.getValue()].add(m.getKey());
        }
        int setlen = set.length;
        int flag = 0,count = 0;
        for (int i = setlen-1; i >= 0; i--) {
            if(set[i] == null) continue;
            for (int j = set[i].size()-1; j > -1; j--) {
                //System.out.println(actlen+" "+ arr.length/2);
                actlen = actlen - map.get(set[i].get(j));
                //System.out.println(actlen+" "+map.get(set[i].get(j))+" "+set[i].get(j));
                if(actlen <= arr.length/2 ){
                    flag = 1;
                    count++;
                    break;
                }else{
                    count++;
                }
            }
            if(flag == 1){
                break;
            }
        }
        return count;
    }
}
