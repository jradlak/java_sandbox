package com.jrd.fourth_chapter.geometry;

/**
 * Created by jakub on 07.06.16.
 */
public class Circle extends Shape {

    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return point;
    }
}
