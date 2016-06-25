package com.jrd.fifth_chapter.ReadOperations;

import org.junit.Test;

/**
 * Created by jakub on 25.06.16.
 */
public class ScannerWriterTest {

    @Test
    public void scanFileTest() {
        ScannerWriter sw = new ScannerWriter();
        sw.scanFile("doublesErr.txt");
    }
}
