package com.jrd.seventh_chapter.zdania;

import org.junit.Test;

/**
 * Created by jradl on 03.10.2016.
 */
public class TasowatorSlowTest {
    @Test
    public void tasujSlowaTest() {
        String zdanie = TasowatorSlow.tasuj("W tych pięknych okolicznościach przyrody.");

        System.out.println(zdanie);
    }
}
