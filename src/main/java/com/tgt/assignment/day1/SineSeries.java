package com.tgt.assignment.day1;

public class SineSeries {

    static int fact(int n){
        if(n==0)
            return 1;
        else
            return(n*fact(n-1));
    }

    static double power(double base,int pow){
        if(pow==0)
            return 1;
        else
            return base*power(base,pow-1);
    }

    static double term(int n,double x){
        return power(-1,n)*power(x,2*n+1)/fact(2*n+1);
    }

    static void findSin(double deg){
        double x=3.1416/180*deg;
        double sum=0.0;
        for(int i=0;i<=10;i++)
            sum+=term(i,x);
        System.out.println("Sine of "+deg+" degrees is "+sum);
    }

    public static void main(String[] args){
        findSin(45);
        findSin(90);
        findSin(30);
        findSin(60);
    }
}
