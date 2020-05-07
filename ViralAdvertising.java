package com.company;

public class ViralAdvertising {
    public static void main(String[] args) {

    }

    static int viralAdvertising(int n) {
        int sum=0;int temp=5;
        for(int i=1;i<=n;i++)
        {
            temp/=2;
            temp+=sum;
            temp*=3;
        }

        return sum;
    }
}
