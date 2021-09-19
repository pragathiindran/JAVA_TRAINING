package com.tgt.assignment.day1;

public class ValidDate {
    static int max_value=9999;
    static int min_value=1800;

    static boolean isLeap(int year){
        return(((year%4==0)&&(year%100!=0))||(year%400==0));
    }

    static boolean isValidDate(int year, int month, int day) {
        if(month<1||month>12)
            return false;
        if(day<1||day>31)
            return false;
        if (month == 2) {
            if(isLeap(year))
                return(day<=29);
            else
                return(day<=28);
        }
        if(month==4||month==6||month==9||month==11)
            return(day<=30);
        return true;
    }

    public static void main(String[] args){
        if(isValidDate(2018,13,1))
            System.out.println("2018/13/1 is a Valid date");
        else
            System.out.println("2018/13/1 is an Invalid date");
        if(isValidDate(2018,2,29))
            System.out.println("2018/2/29 is a Valid date");
        else
            System.out.println("2018/2/29 is an Invalid date");
        if(isValidDate(2016,2,29))
            System.out.println("2016/2/29 is a Valid date");
        else
            System.out.println("2016/2/29 is an Invalid date");
    }
}
