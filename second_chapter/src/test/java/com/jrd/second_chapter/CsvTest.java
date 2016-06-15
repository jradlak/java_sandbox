package com.jrd.second_chapter;

import org.junit.Test;

import java.io.IOException;

/**
 * Created by jakub on 02.05.16.
 */
public class CsvTest {

    @Test
    public void testReadCsv() throws IOException {
        Csv.printCsv("test.csv");
    }
}
