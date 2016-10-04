package com.jrd.seventh_chapter.niemodyfikowalne;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by jradl on 04.10.2016.
 */
public class ListaWidok {
    public static List<Integer> zwrocNiemodyfikowalnaListe(Integer n) {
        return Collections.unmodifiableList(IntStream.range(0, n)
                .boxed()
                .collect(Collectors.toList()));
    }
}
