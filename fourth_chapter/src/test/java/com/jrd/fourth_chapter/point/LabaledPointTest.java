package com.jrd.fourth_chapter.point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ThinkPad on 2016-06-07.
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
}