package com.jrd.eight_chapter.litery;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by jakub on 04.04.17.
 */
public class NajwiekszaDlugoscTest {

    private NajwiekszaDlugosc najwiekszaDlugosc;

    @Before
    public void setup() {
        this.najwiekszaDlugosc = new NajwiekszaDlugosc(new Slownik());
    }

    @Test
    public void najdluzszeSlowaTest() {
        List<String> slowa = najwiekszaDlugosc.znajdzNajdluzszeCiagi();

        Assert.assertTrue(slowa.size() > 0);
    }
}
