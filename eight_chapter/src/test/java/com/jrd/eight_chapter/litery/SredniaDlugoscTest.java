package com.jrd.eight_chapter.litery;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jakub on 27.03.17.
 */
public class SredniaDlugoscTest {
    private SredniaDlugosc sredniaDlugosc;

    @Before
    public void setup() {
        this.sredniaDlugosc = new SredniaDlugosc(
                new Slownik("/usr/share/dict/polish"));
    }

    @Test
    public void setSredniaDlugoscTest() {
        long dlugosc = sredniaDlugosc.obliczSredniaDlugoscSlow();

        Assert.assertTrue(dlugosc > 0);
    }
}
