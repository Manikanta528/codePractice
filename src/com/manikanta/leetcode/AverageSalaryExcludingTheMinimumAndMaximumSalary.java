package com.manikanta.leetcode;

//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/

public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public static void main(String[] args) {
        int salary[] = {8000,9000,2000,3000,6000,1000};
        double avg = average(salary);
        System.out.println(avg);
    }
    public static double average(int[] salary) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int len = salary.length;
        double sal = 0;
        for (int i = 0; i < len; i++) {
            if(min > salary[i] ){
                min = salary[i];
            }
            if(max < salary[i]){
                max = salary[i];
            }
            sal+=salary[i];
        }
        sal -= min;
        sal -= max;
        double avgSal = (sal)/(len-2);
        return avgSal;
    }
}
