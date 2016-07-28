package com.jrd.seventh_chapter.zamiana;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Kuba on 2016-07-28.
 */
public class ZamianaTest {

    private final String[] arrayTest = new String[] { "abc", "def", "ghj" };

    private final String[] arrayResult = new String[] { "ABC", "DEF", "GHJ" };

    @Test
    public void zamianaIteratorTest() {
        List<String> result = Zamiana.zamianaIterator(Arrays.asList(arrayTest));
        testResult(result);
    }

    @Test
    public void zamianaPetlaTest() {
        testResult(Zamiana.zamianaPetla(Arrays.asList(arrayTest)));
    }

    @Test
    public void zamianaReplaceAllTest() {
        testResult(Zamiana.zamianaReplaceAll(Arrays.asList(arrayTest)));
    }

    private void testResult(List<String> result) {
        IntStream.range(0, result.size()).forEach(e ->
            Assert.assertTrue(arrayResult[e].equals(result.get(e)))
        );
    }
}
