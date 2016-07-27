package com.jrd.seventh_chapter.erastotenes;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * Created by Kuba on 2016-07-27.
 *
 * Rozwiązanie zadania 1 z rozdziału 7: Sito Erastotenesa
 */
public class Erastotenes {
    public static List<Long> wyznaczLiczbyPierwsze(Long zakres) {
        Set<Long> block = new HashSet<>(LongStream.iterate(2, i -> i + 1).limit(zakres).boxed()
                .collect(Collectors.toList()));

        Set<Long> result = new HashSet<>();
        while (true) {
            Long s = block.stream().min(Long::compareTo).get();
            if (s >= zakres) break;
            result.add(s);
            block.remove(s);
            long i = 0;
            while (true) {
                final long e = s * (s + i);
                if (e > zakres) break;
                block = block.stream().filter(el -> el != e).collect(Collectors.toSet());
                i++;
            }
        }
        return result.stream().sorted().collect(Collectors.toList());
    }
}
