package com.tgt.assignment.day1;

import java.util.Scanner;

public class NumToWords {

    public static String inWords(int num) {
        String words="";
        String[] unitsArray={"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven","Eight","Nine",
                "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tensArray={"Zero","Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy","Eighty","Ninety"};
        if(num==0)
            return "Zero";
        if (num < 0) {
            String numStr=""+num;
            numStr=numStr.substring(1);
            return "minus " + inWords(Integer.parseInt(numStr));
        }
        if((num/10000000)>0){
            words+=inWords(num/10000000)+" crore ";
            num%=10000000;
        }
        if((num/100000)>0){
            words+=inWords(num/100000)+" lakh ";
            num%=100000;
        }
        if((num/1000)>0){
            words+=inWords(num/1000)+" thousand ";
            num%=1000;
        }
        if((num/100)>0){
            words+=inWords(num/100)+" hundred ";
            num%=100;
        }
        if(num>0) {
            if(num<20)
                words += unitsArray[num];
            else{
                words += tensArray[num / 10];
                if ((num % 10) > 0) {
                    words += "-" + unitsArray[num % 10];
                }
            }
        }
        return words;
    }

    public static void main(String[] args){
        int number=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please type the number with max 9 digits : ");
        try{
            number=sc.nextInt();
            if(number==0)
                System.out.println("Number in words : zero");
            else
                System.out.println("Number in words : "+ inWords(number));
        }
        catch (Exception e){
            System.out.println("Please enter a valid number");
        }
    }
}
