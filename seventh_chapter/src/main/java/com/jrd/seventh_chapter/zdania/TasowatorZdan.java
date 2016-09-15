package com.jrd.seventh_chapter.zdania;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Kuba on 2016-09-15.
 */
public class TasowatorZdan {
    private List<String> zdania;

    public TasowatorZdan(Collection<String> zdania) {
        this.zdania = new ArrayList<>(zdania);
    }

    public Collection<String> tasuj() {
        List<String> wynik = new ArrayList<>();
        zdania.stream().forEach(z -> {
            List<String> slowa = new ArrayList<>(Arrays.asList(z.split(" ")));
            Collections.shuffle(slowa.subList(1, slowa.size() - 1));
            wynik.add(slowa.stream().collect(Collectors.joining(" ")));
        });

        return wynik;
    }
}
