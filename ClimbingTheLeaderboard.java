package com.company;

import java.util.*;

public class ClimbingTheLeaderboard {
    public static void main(String[] args) {
        int[] a={100,90,90,75,80,60};
        int[] b={50 ,65 ,77 ,90 ,102};
        climbingLeaderboard(a,b);

    }

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        HashSet<Integer> result=new HashSet<>();
        for(int i:scores)
            result.add(i);
        for (int i:alice)
            result.add(i);

        int[] NewAns=new int[alice.length];
        List<Integer> list=new ArrayList<>(result);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        int[] myArray = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(alice));
        for(int i=0;i<alice.length;i++)
            NewAns[i]=list.indexOf(alice[i]);


        System.out.println(Arrays.toString(NewAns));
        return NewAns;
    }
}
