package com.tgt.assignment.day3.programs;

import java.util.Scanner;

import static com.tgt.assignment.day1.PrintCalendar.dayCalculate;
import static java.time.Year.isLeap;

public class Assignment17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month,year;

        System.out.println("Enter the month and year in YYYY-MM format : ");
        String date=sc.nextLine();
        try{
            checkValidInput(date);
        }
        catch(InvalidInputException e){
            e.getMessage();
        }

        String[] str=date.split("-",2);
        year=Integer.parseInt(str[0]);
        month=Integer.parseInt(str[1]);

        try{
            checkValidDate(month,year);
        }
        catch(InvalidDateException e){
            e.getMessage();
        }
    }

    private static void checkValidDate(int month, int year) throws InvalidDateException {
        if (month < 0 || month > 12 || year < 0 || year > 9999) {
            throw new InvalidDateException("The date entered is not valid");
        } else {
            String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
            String[] months = {"", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
            int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (month == 2 && isLeap(year))
                days[month] = 29;
            System.out.println("  " + months[month] + "  " + year);
            for (int i = 0; i < day.length; i++)
                System.out.print(day[i] + " ");
            System.out.println();
            int d = dayCalculate(month, 1, year);
            for (int i = 0; i < d; i++)
                System.out.print("    ");
            for (int i = 1; i <= days[month]; i++) {
                System.out.printf("%2d  ", i);
                if (((i + d) % 7 == 0) || (i == days[month]))
                    System.out.println();
            }
        }
    }

    static boolean isLeap(int year){
        return(((year%4==0)&&(year%100!=0))||(year%400==0));
    }

    public static int dayCalculate(int month,int day,int year){
        int y=year-(14-month)/12;
        int x=y+y/4-y/100+y/400;
        int m=month+12*((14-month)/12)-2;
        return ((day+x+(31*m)/12)%7);
    }

    public static boolean checkValidInput(String date) throws InvalidInputException{
        if(!date.matches("\\d\\d\\d\\d[\\-]\\d\\d")){
            throw new InvalidInputException("Date entered is in invalid format");
        }
        else
            return true;
    }
}
