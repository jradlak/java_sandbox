package com.jrd.fourth_chapter.geometry;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jakub on 09.06.16.
 */
public class GeometryTest {

    @Test
    public void testCircle() {
        Circle circle = new Circle(10, 10, 20);
        circle.moveBy(2, -1);
        Point center = circle.getCenter();
        Assert.assertTrue(center.getX() == 12 && center.getY() == 9);
    }

    @Test
    public void testLine() {
        Line line = new Line(new Point(10, 10), new Point(20, 20));
        Point center = line.getCenter();
        Assert.assertTrue(center.getX() == 15 && center.getY() == 15);
    }

    @Test
    public void testRectangle() {
        Rectangle rectangle = new Rectangle(new Point(50, 50), 50, 20);
        Point center = rectangle.getCenter();
        Assert.assertTrue(center.getX() == 75 && center.getY() == 40);
    }
}
