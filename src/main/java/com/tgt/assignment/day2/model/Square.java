package com.tgt.assignment.day2.model;

public class Square extends Rectangle{
    public Square(){}

    public Square(double side){super(side,side);}

    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square[+" +
                super.toString()+
                "side=" + super.getWidth() +
                ", area="+super.getArea()+
                ", Perimeter="+super.getPerimeter()+
                "]";
    }
}
