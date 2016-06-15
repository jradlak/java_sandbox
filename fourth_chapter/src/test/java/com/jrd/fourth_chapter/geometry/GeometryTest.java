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

    @Test
    public void testClonePoint() {
        Point point = new Point(10, 10);
        Point cPoint = point.clone();
        Assert.assertTrue(point.getX() == cPoint.getX() && point.getY() == cPoint.getY());
    }

    @Test
    public void testCloneCircle() {
        Circle circle = new Circle(10, 12, 3);
        Circle cCircle = circle.clone();
        circle.moveBy(2, 3);
        Assert.assertTrue(circle.getCenter().getX() - cCircle.getCenter().getX() == 2);
        Assert.assertTrue(circle.getCenter().getY() - cCircle.getCenter().getY() == 3);
    }

    @Test
    public void testCloneLine() {
        Line line = new Line(new Point(10, 10), new Point(20, 20));
        Line cLine = line.clone();
        Assert.assertTrue(line.getCenter().equals(cLine.getCenter()));
        line.moveBy(12, 13);
        Assert.assertTrue(!line.getCenter().equals(cLine.getCenter()));
    }

    @Test
    public void testCloneRectangle() {
        Rectangle rect = new Rectangle(new Point(10, 20), 5, 6);
        Rectangle cRect = rect.clone();
        Assert.assertTrue(rect.getCenter().equals(cRect.getCenter()));
        rect.moveBy(2, 3);
        Assert.assertTrue(!rect.getCenter().equals(cRect.getCenter()));
    }
}
