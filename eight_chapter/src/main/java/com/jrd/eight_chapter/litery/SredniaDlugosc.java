package com.jrd.eight_chapter.litery;

import java.util.List;

/**
 * Created by jakub on 27.03.17.
 *
 * Rozwiązanie zadania 9 z rozdziału 8:
 * Znajdowanie średniej długości ciągu znaków
 */
public class SredniaDlugosc {
    private final String plik = "/usr/share/dict/words";

    List<String> slowa;

    public SredniaDlugosc(Slownik slownik) {
        this.slowa = slownik.getSlowa();
    }

    public Long obliczSredniaDlugoscSlow() {
        return slowa.stream().mapToLong(String::length).sum() / slowa.size();
    }
}
