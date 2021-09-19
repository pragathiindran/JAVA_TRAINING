package com.tgt.assignment.day3.programs;

public class InvalidInputException extends Exception{
    public InvalidInputException(String message){
        super(message);
        System.out.println(message);
    }
}
