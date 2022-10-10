package com.manikanta.leetcode;

//https://leetcode.com/problems/adding-spaces-to-a-string/

public class AddingSpacesToAString {
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int spaces[] = {8,13,15};
        System.out.println(addSpaces(s,spaces));
    }
    public static String addSpaces(String s, int[] spaces) {
        String space = " ";
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i < spaces.length; i++){
            if(i == 0){
                str.append(s.substring(0,spaces[i]));
            }else{
                str.append(s.substring(spaces[i-1],spaces[i]));
            }
            str.append(space);
        }
        str.append(s.substring(spaces[spaces.length-1],s.length()));
        return str.toString();
    }
}
