package com.jrd.second_chapter;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jakub on 27.04.16.
 */
public class PointTest {
    @Test
    public void testPoint() {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5, 0.5);
        Assert.assertTrue(p.toString().equals("(2.0, 3.5)"));
    }
}
