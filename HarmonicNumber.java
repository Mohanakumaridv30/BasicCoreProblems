package com.bridgelabz.basiccorejava;

import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double num=0, result=0, i;
        int n;
        System.out.print("Enter the Harmonic Number : ");
        n = s.nextInt();

        for(i=1; i<=n; i++) {
            num = num + (1/i);
            result = num;
        }
        System.out.println("The Value of Harmonic Number "+n+" is "+result);
    }
}