package com.company;

import java.util.Scanner;

public class SaveThePrisioner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        for(int i=0;i<x;i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            System.out.println(saveThePrisoner(n, m, s));

        }
    }

    static int saveThePrisoner(int N, int M, int S) {
        int poisonedPrisoner = (S + M - 1) % N;
        if(poisonedPrisoner == 0)
            poisonedPrisoner=N;
        return poisonedPrisoner;
    }
}
