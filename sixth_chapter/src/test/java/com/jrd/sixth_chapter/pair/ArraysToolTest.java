package com.jrd.sixth_chapter.pair;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by Kuba on 2016-07-16.
 */
public class ArraysToolTest {

    @Test
    public void pierwszyIOstatniTest() {
        Pair<Double> minimax = ArraysTool.pierwszyOstatni(
                new ArrayList<>(Arrays.asList(new Double[]{
                5.1, 2.5, 2.6, 8.1, 3.4
        })));

        Assert.assertTrue(2.5 == minimax.getFirst()
                && 8.1 == minimax.getLast());
    }
}
