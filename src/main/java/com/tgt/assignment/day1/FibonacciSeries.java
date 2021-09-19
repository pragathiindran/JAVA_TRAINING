package com.tgt.assignment.day1;
//0,1,1,2,3,5,8,13,21,34,55,89,144
import java.util.Scanner;

public class FibonacciSeries {

    public static int fibonacci(int index) {
        if(index==0) return 0;
        if(index==1) return 1;
        return fibonacci(index-1)+fibonacci(index-2);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index");
        int index=sc.nextInt();
        System.out.println("NOTE:The index starts from 0");
        System.out.print("The number at "+index+" place is "+fibonacci(index));
    }
}
