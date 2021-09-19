package com.tgt.assignment.day3.model;

public class MovableCircle implements Movable {

    private MovablePoint center;
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() { center.y -= center.ySpeed; }

    @Override
    public void moveDown() {center.y += center.ySpeed; }

    @Override
    public void moveLeft() {center.x += center.xSpeed; }

    @Override
    public void moveRight() {center.x -= center.xSpeed; }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
