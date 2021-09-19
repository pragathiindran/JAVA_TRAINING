package com.tgt.assignment.day4.exception;

public class DaoException extends Exception{
    public DaoException(){ super();}

    public DaoException(Throwable cause){
        super(cause);
    }

    public DaoException(String message){
        super(message);
    }
}
