package com.jrd.fourth_chapter.geometry;

/**
 * Created by jakub on 07.06.16.
 */
public class Line extends Shape {

    Point to;

    public Line(Point from, Point to) {
        super(from.getX(), from.getY());
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return new Point(
                    (to.getX() - point.getX()) / 2,
                    (to.getY() - point.getY()) / 2
                );
    }
}
