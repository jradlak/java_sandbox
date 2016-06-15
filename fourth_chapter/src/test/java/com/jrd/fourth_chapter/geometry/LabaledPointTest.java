package com.jrd.fourth_chapter.geometry;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Jakub on 2016-06-07.
 */
public class LabaledPointTest {

    private static final String labelPoint1 = "labeled point 1";

    @Test
    public void labeledPointTest() {
        LabeledPoint labeledPoint = new LabeledPoint(10, 20, labelPoint1);
        Assert.assertTrue(labeledPoint.getX() == 10.0);
        Assert.assertTrue(labeledPoint.getY() == 20.0);
        Assert.assertTrue(labelPoint1.equals(labeledPoint.getLabel()));
    }

    @Test
    public void translatePointTest() {
        LabeledPoint labeledPoint = new LabeledPoint(10, 20, labelPoint1);
        labeledPoint.translate(2.0, -3.0);
        Assert.assertTrue(labeledPoint.getX() == 12.0);
        Assert.assertTrue(labeledPoint.getY() == 17.0);

    }
}