package com.jrd.fifth_chapter.ReadOperations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * Created by jakub on 20.06.16.
 */
public class DoubleFileReaderTest {

    private DoubleFileReader reader;

    @Before
    public void setup() {
        reader = new DoubleFileReader();
    }

    @Test
    public void readDoubleValuesTest() throws IOException {
        List<Double> values = reader.readValues("doubles1.txt");
        Assert.assertTrue(values.size() > 0);
    }

    @Test(expected = NumberFormatException.class)
    public void readNonNumberTest() throws NumberFormatException, IOException {
        reader.readValues("doublesErr.txt");
    }
}