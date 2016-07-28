package com.jrd.seventh_chapter.sets;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Kuba on 2016-07-28.
 *
 * Rozwiązanie zadania 3 z rozdziału 7
 */
public class SetTest {

    @Test
    public void sumaPrzeciecieRoznicaTest() {
        Set<Long> a = new HashSet<>(Arrays.asList(new Long[] { 1L, 2L, 3L }));
        Set<Long> b = new HashSet<>(Arrays.asList(new Long[] { 3L, 4L }));

        Set<Long> suma = new HashSet<>(a);
        suma.addAll(b);

        Set<Long> roznica = new HashSet<>(a);
        roznica.removeAll(b);

        Set<Long> przeciecie = new HashSet<>(a);
        przeciecie.retainAll(b);

        testujZbior(suma, new Long[] { 1L, 2L, 3L, 4L });
        testujZbior(roznica, new Long[] { 1L, 2L });
        testujZbior(przeciecie, new Long[] { 3L });
    }

    public void testujZbior(Set<Long> zbior, Long[] test) {
        Assert.assertTrue(
                new HashSet<>(Arrays.asList(test))
                        .equals(zbior));
    }
}
