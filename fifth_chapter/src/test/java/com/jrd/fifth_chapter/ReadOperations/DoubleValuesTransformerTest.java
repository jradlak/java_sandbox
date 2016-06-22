package com.jrd.fifth_chapter.ReadOperations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by jakub on 22.06.16.
 */
public class DoubleValuesTransformerTest {

    private DoubleValuesTransformer transformer;

    @Before
    public void setup() {
        transformer = new DoubleValuesTransformer(new DoubleFileReader());
    }

    @Test
    public void testSumDouble() throws IOException, NumberFormatException {
        Double sum = transformer.sumOfValues("doubles1.txt");
        Assert.assertTrue(sum == 202.56);
    }
}
