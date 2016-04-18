package com.jrd.firstchapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jakub on 18.04.16.
 * Rozwiązanie zadania 13: losowanie 6 liczb spośród 49
 */
public class Lotto {
    private List<Integer> liczby = new ArrayList<>();

    private final int n = 49;

    private final int k = 6;

    private final Random rnd = new Random();

    public Lotto() {
        for (int i = 1; i <= n; i++) {
            liczby.add(i);
        }
    }

    public List<Integer> losowanie() {
        List<Integer> wynik = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int j = rnd.nextInt(liczby.size());
            Integer liczba = liczby.get(j);
            wynik.add(liczba);
            liczby.remove(liczba);
        }

        return wynik;
    }
}
