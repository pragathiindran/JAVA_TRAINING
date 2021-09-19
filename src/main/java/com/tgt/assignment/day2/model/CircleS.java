package com.tgt.assignment.day2.model;

public class CircleS extends Shape{
    private double radius=1.0;

    public CircleS(){}

    public CircleS(double radius){this.radius=radius;}

    public CircleS(double radius, String color, boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() { return radius; }

    public void setRadius(double radius) { this.radius = radius; }

    public double getArea() { return (3.14*radius*radius); }

    public double getPerimeter () { return (2*3.14*radius); }

    @Override
    public String toString() {
        return "Circle[" +
                super.toString()+
                "radius=" + radius +
                ", area="+getArea()+
                ", Perimeter="+getPerimeter()+
                ']';
    }
}
