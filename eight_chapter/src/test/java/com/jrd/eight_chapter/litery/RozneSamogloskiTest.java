package com.jrd.eight_chapter.litery;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Set;

/**
 * Created by jakub on 21.03.17.
 */
public class RozneSamogloskiTest {

    private RozneSamogloski rozneSamogloski;

    @Before
    public void setup() {
        rozneSamogloski = new RozneSamogloski();
    }

    @Test
    public void testujZwrocSlowa() {
        Set<String> slowa = rozneSamogloski.zwrocSlowa();

        System.out.println("Dokonało się!");
    }
}
