package com.jrd.eight_chapter.litery;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jakub on 04.04.17.
 *
 * Rozwiązanie zadania 10 z rozdziału 8
 */
public class NajwiekszaDlugosc {

    private List<String> slowa;

    public NajwiekszaDlugosc(Slownik slownik) {
        this.slowa = slownik.getSlowa();
    }

    public List<String> znajdzNajdluzszeCiagi() {
        int maxDlugosc =  slowa.stream()
                .max((s1, s2) -> s1.length() - s2.length()
                ).get().length();

        return slowa
                .parallelStream()
                .filter(s -> s.length() == maxDlugosc)
                .collect(Collectors.toList());
    }
}
