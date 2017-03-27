package com.jrd.eight_chapter.litery;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jakub on 27.03.17.
 */
public class Slownik {

    private final String plik = "/usr/share/dict/words";

    private List<String> slowa;

    public Slownik() {
        wczytajSlownik(this.plik);
    }

    public Slownik(String sciezka) {
        wczytajSlownik(sciezka);
    }

    public List<String> getSlowa() {
        return slowa;
    }

    private void wczytajSlownik(String sciezka) {
        String zawartosc = null;
        try {
            zawartosc = new String(Files.readAllBytes(Paths.get(sciezka)));
        } catch (IOException e) {
            System.out.println("Błąd podczas wczytywania słownika. " + e.getMessage());
        }

        slowa = Arrays.asList(zawartosc.split("\\W+"));
    }

}
