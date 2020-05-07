package com.company;

public class Hourglass_2d_ARRAY {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];

        System.out.println(hourglassSum(arr));
    }

    static int hourglassSum(int[][] arr) {

        int sum=0,sum1=Integer.MIN_VALUE;
        for(int j=1;j<arr.length-1;j++)
        {
            for (int i = 2; i < arr.length; i++)
                {
                    sum = (arr[i - 2][j-1]+arr[i - 1][j-1]+arr[i][j-1]) + arr[i-1][j]+(arr[i - 2][j+1]+arr[i - 1][j+1]+arr[i][j+1]);
                    if(sum>=sum1)
                        sum1=sum;
                }
        }
        return sum1;
    }

}
