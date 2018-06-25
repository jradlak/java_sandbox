package com.jrd.eight_chapter.wojnaipokoj;

import com.jrd.eight_chapter.codepoints.CodePoints;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

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
                .filter(CodePoints::poprawnyIdentyfikatorJava)
                .limit(100);
    }

    /**
     * Zwraca 10 najczęściej występujących słów
     *
     */
    public List<String> getMax10() {
        Map<String, Long> liczbaWystapien =
            slowa
                    .stream()
                    .map(String::toLowerCase)
                    .collect(
                        groupingBy(String::new, counting()));

        List<String> result = new ArrayList<>();

        liczbaWystapien
                .entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                        .limit(10)
                .forEachOrdered(x -> result.add(x.getKey()));

        return result;
    }
}
