package com.manikanta.leetcode;

//https://leetcode.com/problems/min-cost-climbing-stairs/

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(cost));
    }
    public static int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        for(int i = 2 ; i < len ; i++){
            cost[i] += Math.min(cost[i-1],cost[i-2]);
        }
        //System.out.println(Arrays.toString(cost));
        return Math.min(cost[len-1],cost[len-2]);
    }
}
