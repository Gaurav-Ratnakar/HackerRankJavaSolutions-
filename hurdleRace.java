package com.company;

import java.util.Arrays;

public class hurdleRace {
    public static void main(String[] args) {
        int[] a;
        int x=4;
        a= new int[]{1, 6, 3, 5, 2};
        System.out.println(hurdleRace(x,a));
    }

    static int hurdleRace(int k, int[] height) {
        int maxHeight=0;
        int ans=0;
        Arrays.sort(height);
        if(maxHeight<k)
        {
            maxHeight=height[height.length-1];
            ans=maxHeight-k;
        }
        return ans;
    }

}
