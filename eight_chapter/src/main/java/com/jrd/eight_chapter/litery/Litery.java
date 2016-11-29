package com.jrd.eight_chapter.litery;

import java.util.stream.Stream;

/**
 * Created by jakub on 29.11.16.
 * Rozwiązanie zadania 5 z rozdzialu 8
 */
public class Litery {
    public static Stream<String> litery(String s) {
        return Stream.of(s.split(""));
    }
}
