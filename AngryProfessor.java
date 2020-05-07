package com.company;

public class AngryProfessor {
    public static void main(String[] args) {

    }
    static String angryProfessor(int k, int[] a) {
        int count=0;
        String result="";
        if(a.length==0)
            result="NO";
        for(int i:a)
        {
            if(i>=0)
                count++;

        }

        if(k>=count)
            result="YES";
        if(k<count)
            result="NO";

        return result;
    }


}
