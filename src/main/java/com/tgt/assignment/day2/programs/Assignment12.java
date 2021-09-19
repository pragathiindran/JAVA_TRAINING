package com.tgt.assignment.day2.programs;

import com.tgt.assignment.day2.model.Circle;
import com.tgt.assignment.day2.model.Cylinder;

public class Assignment12 {

    public static void main(String[] args) {
        Circle[] circles = {
                new Cylinder(12.34),
                new Cylinder(12.34, 10.0),
                new Cylinder(12.34, 10.0, "blue")
        };

        for(Circle circle:circles){
            System.out.println(circle);
            System.out.println("The area of the circle is "+ circle.getArea());
            System.out.println("The volume of the cylinder is "+((Cylinder)circle).getVolume());
        }

    }
}
