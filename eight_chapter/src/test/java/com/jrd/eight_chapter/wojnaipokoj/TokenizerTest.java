package com.jrd.eight_chapter.wojnaipokoj;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by jakub on 06.01.17.
 */
public class TokenizerTest {

    private final static String plik = "wojnaIpokoj.txt";

    private Tokenizer tokenizer;

    @Before
    public void setup() throws IOException {
        tokenizer = new Tokenizer(plik);
    }

    @Test
    public void testTokonizeFirst100() {
        tokenizer.tokenizeFirst100Words().forEach(s -> System.out.println(s));
    }

    @Test
    public void testGetMax10() {
        tokenizer.getMax10().stream().forEach(s -> System.out.print(s + ", "));
    }
}
