package com.manikanta;

//https://codingcompetitions.withgoogle.com/kickstart/round/00000000008f4a94/0000000000b54d3b

import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int p = 0;
        while(t-- > 0){
            int len = sc.nextInt();
            int qur = sc.nextInt();
            String s = sc.next();
            int countCase = 0;
            while(qur-- > 0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                String temp = s.substring(a-1,b);
                System.out.println(temp);
                HashMap<Character, Integer> map = new HashMap<>();
                for(int i = 0; i < temp.length(); i++){
                    char c = temp.charAt(i);
                    map.putIfAbsent(c,0);
                    map.put(c, map.get(c)+1);
                }
                int douLet = 0, sinLet = 0;

                for(Map.Entry<Character,Integer> m : map.entrySet()){
                    if(m.getValue()% 2 == 0){
                      douLet++;
                    }else {
                        sinLet++;
                        if(sinLet > 1) break;
                    }
                }
                System.out.println(douLet+" "+sinLet);
                if(sinLet < 2) countCase++;
            }
            p++;
            System.out.println("Case #"+p+": "+countCase);
        }
    }
}
