package com.jrd.eight_chapter.randomizer;

import java.util.stream.Stream;

/**
 * Created by jakub on 22.11.16.
 *
 * klasa implementująca Liniowy Generator Kongruencyjny
 *
 * Rozwiązanie zadania
 */
public class Lcg {
    private long xn;

    private long a;

    private long c;

    private long m;

    public Lcg(long ziarno, long a, long c, long m) {
        this.xn = ziarno;
        this.a = a;
        this.c = c;
        this.m = m;
    }

    public Stream<Long> randomStream() {
        return Stream.iterate(xn, xn -> (a * xn + c) % m);
    }
}
