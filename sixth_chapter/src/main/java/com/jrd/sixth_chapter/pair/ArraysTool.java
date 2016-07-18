package com.jrd.sixth_chapter.pair;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Kuba on 2016-07-16.
 *
 * Rozwiązanie zadania 9, 10 i 11
 */
public class ArraysTool {

    @SuppressWarnings("unchecked")
    public static <E extends Comparable<E>> Pair<E> pierwszyOstatni(ArrayList<E> a) {
        E max = a.stream().max(Comparable::compareTo).get();
        E min = a.stream().min(Comparable::compareTo).get();

        Pair<E> result = new Pair<>(min, max);
        return result;
    }

    public static <T extends Comparable<T>> T min(T[] a) {
        return Arrays.asList(a).stream().min(Comparable::compareTo).get();
    }

    public static <T extends Comparable<T>> T max(T[] a) {
        return Arrays.asList(a).stream().max(Comparable::compareTo).get();
    }

    public static <T extends Comparable<T>> Pair<T> minMax(T[] a) {
        T min = min(a);
        T max = max(a);

        return new Pair<>(min, max);
    }
}
