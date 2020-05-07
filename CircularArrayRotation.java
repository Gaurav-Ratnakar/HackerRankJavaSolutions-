package com.company;

public class CircularArrayRotation {
    public static void main(String[] args) {

    }

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {

        for(int i = 0; i < k%a.length; i++){
            int j, last;
            last = a[a.length-1];

            for(j = a.length-1; j > 0; j--){
                //Shift element of array by one
                a[j] = a[j-1];
            }

            a[0] = last;
        }
        int[] result=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            result[i]=a[queries[i]];
        }
        return result;
    }
}
