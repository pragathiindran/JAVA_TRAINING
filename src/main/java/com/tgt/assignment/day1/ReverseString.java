package com.tgt.assignment.day1;

import java.util.Scanner;

public class ReverseString {
    public static String reverseByWords(String sentence) {
        String[] words= sentence.split("\\s");
        String result="";
        for(int i=words.length-1;i>=0;i--)
                result=result+words[i]+" ";
        return result;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input string : ");
        String input=sc.nextLine();
        System.out.println("Output String : "+ reverseByWords(input));
    }
}
