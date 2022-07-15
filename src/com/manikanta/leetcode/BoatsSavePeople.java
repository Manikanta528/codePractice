package com.manikanta.leetcode;

//https://leetcode.com/submissions/detail/747469408/
import java.util.Arrays;

public class BoatsSavePeople {
    public static void main(String[] args) {
        int people[] = {3,5,3,4};
        int limit = 5;
        System.out.println(numOfRescueBoats(people, limit));
    }

    private static int numOfRescueBoats(int[] people, int limit) {
        int boats = 0;
        Arrays.sort(people);

        int l= 0,r = people.length-1;
        while(l <= r){
            if(people[l] + people[r] <= limit){
                boats++;
                l++;
                r--;
            }else if(people[l] + people[r] > limit){
                boats++;
                r--;
            }
        }

        return boats;
    }

}
