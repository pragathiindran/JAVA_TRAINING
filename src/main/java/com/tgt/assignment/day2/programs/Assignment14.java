package com.tgt.assignment.day2.programs;

import com.tgt.assignment.day2.model.CircleS;
import com.tgt.assignment.day2.model.Rectangle;
import com.tgt.assignment.day2.model.Shape;
import com.tgt.assignment.day2.model.Square;

public class Assignment14 {
    public static void main(String[] args) {
        Shape[] shapes = {
                new CircleS(11.0, "yellow", true),
                new CircleS(11.0),
                new CircleS(),
                new Rectangle(),
                new Rectangle(4.0, 4.0, "blue", false),
                new Rectangle(3.0, 5.0),
                new Square(11.0),
                new Square(3.0, "black", false),
                new Shape()
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
