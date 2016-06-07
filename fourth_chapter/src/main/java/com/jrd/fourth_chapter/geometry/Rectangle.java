package com.jrd.fourth_chapter.geometry;


/**
 * Created by jakub on 07.06.16.
 */
public class Rectangle extends Shape {

    private double height;

    private double width;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft.getX(), topLeft.getY());
        this.height = height;
        this.width = width;
    }

    @Override
    public Point getCenter() {
        return new Point(point.getX() + width / 2, point.getY() - height / 2);
    }
}
