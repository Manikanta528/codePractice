package com.manikanta.geekforgeeks;

import java.util.*;

public class CountSmallerElements {
    public static void main(String[] args) {
//42
//468 335 1 170 225 479 359 463 465 206 146 282 328 462 492 496 443 328 437 392 105 403 154 293 383 422 217 219 396 448 227 272 39 370 413 168 300 36 395 204 312 323
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextInt();
        }
        int ans[] = countSmallerElements(arr,arr.length);
        for(int v : ans){
            System.out.print(v+" ");
        }
    }

    private static int[] countSmallerElements(int[] arr,int n) {
        //TLR at last 2nd case
        int ans[] = new int[n];



//        HashMap<Integer,Integer> map = new LinkedHashMap<>();
//        for(int i = 0 ; i < n; i++){
//            map.putIfAbsent(arr[i],0);
//            map.put(arr[i],map.get(arr[i])+1);
//        }
//        int minCount = 0;
//        for(int i = 0 ; i < n-1 ; i++){
//            int t = arr[i];
//            if(map.get(t) == 1) map.remove(t);
//            else{
//                map.put(t, map.get(t)-1);
//            }
//            minCount = 0;
//            for(Map.Entry<Integer,Integer> m : map.entrySet()){
//                if(m.getKey() < t){
//                    minCount += m.getValue();
//                }
//            }
//            ans[i] = minCount;
//        }

        //brute force

        int minCount ;
        for(int i = 0 ; i < n-1; i++){
            int t = arr[i];
            minCount=0;
            for(int j = i+1 ; j < n ; j++){
                if(t > arr[j]) minCount++;
            }
            ans[i] = minCount;
        }
        return ans;
    }
}
