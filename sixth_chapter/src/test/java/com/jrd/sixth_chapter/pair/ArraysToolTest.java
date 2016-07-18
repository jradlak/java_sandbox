package com.jrd.sixth_chapter.pair;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


/**
 * Created by Kuba on 2016-07-16.
 */
public class ArraysToolTest {

    private final static Double[] testArray = new Double[] {5.1, 2.5, 2.6, 8.1, 3.4 };

    private final static Double vMin = 2.5;

    private final static Double vMax = 8.1;

    @Test
    public void pierwszyIOstatniTest() {
        Pair<Double> minimax = ArraysTool.pierwszyOstatni(
                new ArrayList<>(Arrays.asList(testArray)));

        pairTest(minimax);
    }

    @Test
    public void minTest() {
        Double min = ArraysTool.min(testArray);

        Assert.assertTrue(vMin.equals(min));
    }

    @Test
    public void maxTest() {
        Double max = ArraysTool.max(testArray);

        Assert.assertTrue(vMax.equals(max));
    }

    @Test
    public void minMaxTest() {
        Pair<Double> minIMax = ArraysTool.minMax(testArray);
        pairTest(minIMax);
    }

    @Test
    public void minMaxTest2() {
        List<Double> wynik = new ArrayList<>();
        ArraysTool.minmax(Arrays.asList(testArray), new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return o1.compareTo(o2);
            }
        }, wynik);

        Assert.assertTrue(wynik.size() == 2);
        Assert.assertTrue(vMin.equals(wynik.get(0)));
        Assert.assertTrue(vMax.equals(wynik.get(1)));
    }

    public void pairTest(Pair<Double> minIMax) {
        Assert.assertTrue(vMin.equals(minIMax.getFirst()) && vMax.equals(minIMax.getLast()));
    }


}
