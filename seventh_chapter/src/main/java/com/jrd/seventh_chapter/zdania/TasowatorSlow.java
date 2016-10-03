package com.jrd.seventh_chapter.zdania;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jradl on 03.10.2016.
 *
 * Rozwiązanie zdania 12 z rozdziału 8
 */
public class TasowatorSlow {
    public static String tasuj(String zdanie) {
        zdanie = zdanie.substring(0, zdanie.lastIndexOf("."));
        zdanie = zdanie.substring(0, 1).toLowerCase() + zdanie.substring(1, zdanie.length());
        List<String> slowa = Arrays.asList(zdanie.split(" "));
        Collections.shuffle(slowa);
        zdanie = slowa.stream().collect(Collectors.joining(" "));
        zdanie = zdanie.substring(0, 1).toUpperCase() + zdanie.substring(1, zdanie.length()) + ".";
        return zdanie;
    }
}
