package com.jrd.sixth_chapter.pair;

/**
 * Created by Kuba on 2016-07-16.
 *
 * Rozwiązanie zadania 7 i 8
 */
public class Pair<E extends Comparable<E>> {

    private E first;

    private E last;

    public Pair(E first, E last) {
        this.first = first;
        this.last = last;
    }

    public E getFirst() {
        return first;
    }

    public E getLast() {
        return last;
    }

    public E min() {
        if (first.compareTo(last) < 0) {
            return first;
        }

        return last;
    }

    public E max() {
        if (first.compareTo(last) > 0) {
            return first;
        }

        return last;
    }
}
