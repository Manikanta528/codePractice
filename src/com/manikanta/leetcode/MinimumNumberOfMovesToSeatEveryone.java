package com.manikanta.leetcode;

//https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone {
    public static void main(String[] args) {
        int[] seats = {3,1,5};
        int[] students = {2,7,4};
        int ans = minMovesToSeat(seats,students);
        System.out.println(ans);
    }

    private static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int diff = 0,len = seats.length;
        for (int i = 0; i < len; i++) {
            diff += Math.abs(seats[i]-students[i]);
        }
        return diff;
    }
}
