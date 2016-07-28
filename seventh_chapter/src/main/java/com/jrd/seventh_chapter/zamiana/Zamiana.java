package com.jrd.seventh_chapter.zamiana;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Kuba on 2016-07-28.
 *
 * Rozwiązanie zadania 2 z rozdziału 7
 */
public class Zamiana {
    public static List<String> zamianaIterator(List<String> a) {
        List<String> result = new ArrayList<>();
        Iterator<String> aiter =  a.iterator();
        while (aiter.hasNext()) {
            result.add(aiter.next().toUpperCase());
        }

        return result;
    }

    public static List<String> zamianaPetla(List<String> a) {
        List<String> result = new ArrayList<>();
        for (String e : a) {
            result.add(e.toUpperCase());
        }

        return result;
    }

    public static List<String> zamianaReplaceAll(List<String> a) {
        (new ArrayList<>(a))
                .forEach(e -> Collections.replaceAll(a, e, e.toUpperCase()));

        return a;
    }
}
