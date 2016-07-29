package com.jrd.seventh_chapter.words;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.TreeMap;

/**
 * Created by Kuba on 2016-07-29.
 *
 * Rozwiązanie zadania 7 z rozdziału 7
 */
public class WordsCounter {
    public static TreeMap<String, Integer> policzSlowa(String nazwaPliku) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(nazwaPliku)));
        String[] words = content
                .replace(".", "").replace("-", "").replace("\"", "").replace("?", "")
                .split(" ");

        TreeMap<String, Integer> result = new TreeMap<>();
        Arrays.asList(words).forEach(w -> result.compute(w,
                (k, v) -> v == null ? 1 : v + 1 ));

        return result;
    }
}
