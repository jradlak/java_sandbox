package com.jrd.sixth_chapter.pair;

import java.util.ArrayList;

/**
 * Created by Kuba on 2016-07-16.
 *
 * Rozwiązanie zadania 9
 */
public class ArraysTool {

    @SuppressWarnings("unchecked")
    public static <E extends Comparable<E>> Pair<E> pierwszyOstatni(ArrayList<E> a) {
        E max = a.stream().max(Comparable::compareTo).get();
        E min = a.stream().min(Comparable::compareTo).get();

        Pair<E> result = new Pair<>(min, max);
        return result;
    }
}
