package com.tgt.assignment.day1;

import java.util.Scanner;

public class PrintCalendar {

    static boolean isLeap(int year){
        return(((year%4==0)&&(year%100!=0))||(year%400==0));
    }

    public static void printCalendar(int month, int year) {
        String[] day={"SUN","MON","TUE","WED","THU","FRI","SAT"};
        String[] months={"","JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        int[] days={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(month==2 && isLeap(year))
            days[month]=29;
        System.out.println("  "+months[month]+"  "+year);
        for(int i=0;i<day.length;i++)
            System.out.print(day[i]+" ");
        System.out.println();
        int d=dayCalculate(month,1,year);
        for(int i=0;i<d;i++)
            System.out.print("    ");
        for(int i=1;i<=days[month];i++){
            System.out.printf("%2d  ",i);
            if(((i+d)%7==0)||(i==days[month]))
                System.out.println();
        }
    }

    public static int dayCalculate(int month,int day,int year){
        int y=year-(14-month)/12;
        int x=y+y/4-y/100+y/400;
        int m=month+12*((14-month)/12)-2;
        return ((day+x+(31*m)/12)%7);
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
        System.out.println("Enter the month");
        int month=sc.nextInt();
        printCalendar(month,year);
    }
}
