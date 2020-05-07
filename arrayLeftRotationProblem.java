package com.company;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaGrammar;

import java.util.Scanner;

public class arrayLeftRotationProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n;i++)
            System.out.println((i+n-d)%n);
    }
}