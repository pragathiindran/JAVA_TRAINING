package com.tgt.assignment.day1;

import java.util.Scanner;
import static java.lang.Math.*;

public class SortNum {

    public static void sortThreeNumbers(int a, int b, int c) {
        int maximum=max(a,max(b,c));
        int minimum=min(a,min(b,c));
        int middle=(a+b+c)-(maximum+minimum);
        System.out.println("The sorted numbers are : "+minimum+" "+middle+" "+maximum);
    }

    public static void sortThreeNumbers1(int a, int b, int c) {
        if((a<=b)&&(a<=c)){
            if(b<=c)
                System.out.println("The sorted numbers are : "+a+" "+b+" "+c);
            else
                System.out.println("The sorted numbers are : "+a+" "+c+" "+b);
        }
        else if((b<=a)&&(b<=c)){
            if(a<=c)
                System.out.println("The sorted numbers are : "+b+" "+a+" "+c);
            else
                System.out.println("The sorted numbers are : "+b+" "+c+" "+a);
        }
        else{
            if(a<=b)
                System.out.println("The sorted numbers are : "+c+" "+a+" "+b);
            else
                System.out.println("The sorted numbers are : "+c+" "+b+" "+a);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sortThreeNumbers(a,b,c);
        sortThreeNumbers1(a,b,c);
    }
}
