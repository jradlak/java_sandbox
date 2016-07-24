package com.jrd.sixth_chapter.pair;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;


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

    @Test
    public void mapTest() {
        ArrayList<Double> testList = new ArrayList<>(Arrays.asList(testArray));
        ArrayList<Double> resultList = ArraysTool.map(testList, e -> e * 2);

        Assert.assertTrue(testList.size() == resultList.size());
        for (int i = 0; i < testList.size(); i++) {
            Assert.assertTrue(testList.get(i) * 2 == resultList.get(i));
        }
    }

    @Test
    public void powtarzajTest() {
        Integer[] intarr = ArraysTool.powtarzaj(10, 42, Integer[]::new);

        Assert.assertTrue(Arrays.stream(intarr).allMatch(a -> a.equals(42)));
    }

    @Test
    public void repeatTest() {
        Double[] doubledArray = ArraysTool.repeat(2, testArray);

        Assert.assertTrue(doubledArray.length == testArray.length * 2);

        for (int i = 0; i < testArray.length; i++) {
            Assert.assertTrue(doubledArray[i].equals(doubledArray[i + testArray.length]));
        }
    }

    @Test
    public void createArrayTest() {
        List<Double>[] arr = ArraysTool.<List<Double>>createArray(10);
        Assert.assertTrue(arr.length == 10);
    }

    @Test
    public void doWorkTest() {
        //TODO: fix this!!!
        //ArraysTool.doWork(() -> new String("test"), FileNotFoundException::new);
    }

    public void pairTest(Pair<Double> minIMax) {
        Assert.assertTrue(vMin.equals(minIMax.getFirst()) && vMax.equals(minIMax.getLast()));
    }
}
