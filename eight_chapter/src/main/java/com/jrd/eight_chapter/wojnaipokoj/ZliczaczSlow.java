package com.jrd.eight_chapter.wojnaipokoj;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * Created by jradl on 11.10.2016.
 *
 * Rozwiązanie zadania 2 z rozdziału 8
 */
public class ZliczaczSlow {
    private int dlugoscSlowa;

    private List<String> slowa;

    public ZliczaczSlow(String plik, int dlugoscSlowa) throws IOException {
        String zawartosc = new String(Files.readAllBytes(Paths.get(plik)));
        slowa = Arrays.asList(zawartosc.split("\\W+"));
        this.dlugoscSlowa = dlugoscSlowa;
    }

    public Map<Integer, Long> licznikDlugichSlowRownolegle() {
        return zliczaj(slowa.parallelStream());
    }

    public Map<Integer, Long> licznikDlugichSlowSekwencyjnie() {
        return zliczaj(slowa.stream());
    }

    private Map<Integer, Long> zliczaj(Stream<String> strumien) {
        return strumien
                .filter(s -> s.length() > dlugoscSlowa)
                .collect(groupingBy(String::length, counting()));
    }
}