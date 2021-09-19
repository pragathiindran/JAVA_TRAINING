package com.tgt.assignment.day1;

import java.util.Scanner;

public class TriPattern {

    public static void printPattern(int num){
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printPattern(n);
    }
}

