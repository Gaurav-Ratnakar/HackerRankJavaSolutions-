package com.company;

import java.util.ArrayList;
import java.util.List;

public class SequenceEquation {
    public static void main(String[] args) {

    }
    static int[] permutationEquation(int[] p) {
        int[] result=new int[p.length];
        for (int x=0;x<p.length;x++)
        {
            if(x==p[x]&&x==p[p[x]])
                result[x]=x;
        }

        return result;
    }

}
