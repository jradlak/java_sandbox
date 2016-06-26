package com.jrd.fifth_chapter;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jakub on 26.06.16.
 */
public class MinimumFinderTest {

    @Test
    public void findMinimumTest() {
        Integer[] values = { 1, 4, -9, 3, 11};
        int min = (new MinimumFinder()).min(values);
        Assert.assertTrue(min == -9);
    }
}