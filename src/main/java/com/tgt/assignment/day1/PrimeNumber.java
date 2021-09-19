package com.tgt.assignment.day1;

import java.util.Scanner;

public class PrimeNumber {

    static boolean isPrimeNumber(int num) {
        if(num<=1)
            return false;
        for(int i=2;i<num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to be checked:");
        int num1=sc.nextInt();
        if(isPrimeNumber(num1))
            System.out.println("Its a prime number");
        else
            System.out.println("Its not a prime number");
    }
}
