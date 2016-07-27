package com.jrd.seventh_chapter.erastotenes;

import org.junit.Test;

import java.util.List;

/**
 * Created by Kuba on 2016-07-27.
 */
public class ErastotenesTest {

    @Test
    public void wyznaczLiczbyPierwszeTest() {
        List<Long> liczbyPierwsze = Erastotenes.wyznaczLiczbyPierwsze(100L);
        System.out.println(liczbyPierwsze);
    }
}
