package com.tgt.assignment.day1;

import java.util.Scanner;

public class PrimeSum {

    static boolean isPrimeNumber(int num) {
        if(num<=1)
            return false;
        for(int i=2;i<num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }

    public static int sumOfPrimes(int from, int to) {
        int sum=0;
        for(int i=from;i<=to;i++) {
            if (isPrimeNumber(i))
                sum += i;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int from=sc.nextInt();
        int to=sc.nextInt();
        System.out.println("sum of prime numbers from "+from+" to " +to+" is "+sumOfPrimes(from,to));
    }
}
