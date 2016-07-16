package com.jrd.sixth_chapter.pair;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Kuba on 2016-07-16.
 */
public class PairTest {

    private final static double first = 123.45;

    private final static double last = 22.78;

    @Test
    public void minimaxTest() {
        Pair<Double> pair = new Pair<>(first, last);

        Assert.assertTrue(last == pair.min());
        Assert.assertTrue(first == pair.max());
    }
}
