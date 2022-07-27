package com.manikanta.geekforgeeks;

class MaximumNoOf1sRow
{
    public static void main(String[] args) {
        int Mat[][] = {{0,1,1,1},{1,1,1,1},{0,0,1,1}};
        System.out.println(maxOnes(Mat,Mat.length,Mat[0].length));
    }
    public static int maxOnes (int Mat[][], int N, int M)
    {
        // your code here
        int maxInd = -1,maxCount = 0;
        for(int i = 0 ; i < N ; i++){
            int count = 0;
            for(int j = M-1; j >= 0 ; j--){
                if(Mat[i][j] == 1) count++;
                if(Mat[i][j] == 0) break;
            }
            if(maxCount < count){
                maxCount = count;
                maxInd = i;
            } 
        }
        return maxInd;
    }
}