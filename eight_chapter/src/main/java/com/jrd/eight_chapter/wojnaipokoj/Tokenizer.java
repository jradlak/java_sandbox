package com.jrd.eight_chapter.wojnaipokoj;

import com.jrd.eight_chapter.codepoints.CodePoints;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by jakub on 06.01.17.
 *
 * Rozwiązanie zadania 7 z rozdziału 8
 */
public class Tokenizer {

    private List<String> slowa;

    public Tokenizer(String plik) throws IOException {
        String zawartosc = new String(Files.readAllBytes(Paths.get(plik)));
        slowa = Arrays.asList(zawartosc.split("\\W+"));
    }

    public Stream<String> tokenizeFirst100Words() {
        return slowa
                .stream()
                .filter(s -> CodePoints.poprawnyIdentyfikatorJava(s))
                .limit(100);
    }

    public Stream<String> getMax10() {
        return
    }
}
