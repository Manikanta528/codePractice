package com.manikanta.geekforgeeks;

class RunLengthEncoding
 {
     public static void main(String[] args) {
         String str = "aaabbbbcccd";
         System.out.println(encode(str));
     }
	static String encode(String str)
	{
          //Your code here
          String s = "";
          int len = str.length();
          int p = len-1 ,count = 0;
          for(int i = len -1 ; i  >= 0 ; i--){
              if(str.charAt(i) == str.charAt(p)){
                  count++;
              }else{
                  s = Integer.toString(count)+s;
                  s = str.charAt(p)+s;
                  count=0;
                  p=i;
                  i++;
              }
          }
          s = count+s;
          s = str.charAt(p)+s;
          return s;
          
	}
	
 }