package com.jrd.seventh_chapter.words;

import org.junit.Test;

import java.io.IOException;
import java.util.TreeMap;

/**
 * Created by Kuba on 2016-07-29.
 */
public class WordsCounterTest {

    @Test
    public void displayCountedWords() throws IOException {
        String fileName = "tekst.txt";
        TreeMap<String, Integer> words = WordsCounter.policzSlowa(fileName);

        System.out.println(words.toString());
    }
}
