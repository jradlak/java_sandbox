package com.jrd.eight_chapter.wojnaipokoj;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;

/**
 * Created by jradl on 11.10.2016.
 */
public class ZliczaczSlowTest {

    private final static String plik = "wojnaIpokoj.txt";

    private ZliczaczSlow zliczaczSlow;

    @Before
    public void setup() throws IOException {
        zliczaczSlow = new ZliczaczSlow(plik, 1);
        System.out.println("Po wczytaniu słów...");
    }

    @Test
    public void zliczajDlugieSlowaRownolegleTest() {
        long startTime = System.currentTimeMillis();
        Map<Integer, Long> liczbySlow = zliczaczSlow.licznikDlugichSlowRownolegle();
        long endTime = System.currentTimeMillis();
        long czas = endTime - startTime;
        System.out.println("Zliczanie równoległe,  czas = " + czas + ", liczby słów = " + liczbySlow);
    }

    @Test
    public void zliczajDlugieSlowaSekwencyjnieTest() {
        long startTime = System.currentTimeMillis();
        Map<Integer, Long> liczbySlowSekwencyjne = zliczaczSlow.licznikDlugichSlowSekwencyjnie();
        long endTime = System.currentTimeMillis();
        long czas = endTime - startTime;
        System.out.println("Zliczanie sekwencyjne, czas = " + czas + ", liczby słów = " + liczbySlowSekwencyjne);
    }
}
