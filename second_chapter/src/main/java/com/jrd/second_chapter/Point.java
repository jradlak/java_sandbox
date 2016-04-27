package com.jrd.second_chapter;

/**
 * Created by jakub on 27.04.16.
 */
public class Point {

    private double x;

    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double deltaX, double deltaY) {
        return new Point(x + deltaX, y + deltaY);
    }

    public Point scale(double scaleX, double scaleY) {
        return new Point(x * scaleX, y * scaleY);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
