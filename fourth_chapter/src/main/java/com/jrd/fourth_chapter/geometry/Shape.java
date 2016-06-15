package com.jrd.fourth_chapter.geometry;

/**
 * Created by jakub on 07.06.16.
 */
public abstract class Shape {
    protected Point point;

    public Shape(double x, double y) {
        this.point = new Point(x, y);
    }

    public void moveBy(double dx, double dy) {
        point = new Point(point.getX() + dx, point.getY() + dy);
    }

    public abstract Point getCenter();


}
