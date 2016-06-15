package com.jrd.third_chapter;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by jakub on 21.05.16.
 */
public class LuckySortTest {
    private ArrayList<String> list;

    @Before
    public void setup() {
        list = new ArrayList<>(Arrays.asList("Maciek", "Agnieszka", "Adam"));
    }

    @Test
    public void testLuckySort() {
        LuckySort.luckySort(list, Comparator.naturalOrder());
    }
}
