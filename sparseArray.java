package com.company;

import java.util.*;

public class sparseArray {
    public static void main(String[] args) {
        String[] a={"aba","baba","aba","xzxb"};
        String[] b={"aba","xzxb","ab"};
        System.out.println(matchingStrings(a,b).toString());
    }

    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] result=new int[queries.length];

        Set<String> st = new HashSet<String>(Arrays.asList(strings));
        int p=0;
        for(String s:queries) {
            result[p] = Collections.frequency(Arrays.asList(strings), s);
            p++;
        }
        return result;
    }

}

