package com.jrd.third_chapter.spec;

import java.util.Arrays;

/**
 * Created by jakub on 21.05.16.
 */
public interface Measurable {
    double getMeasure();

    /**
     * Rozwiązanie zadania 1.
     * Metoda zwracająca średnią z wartości obietów Measurable
     * @param objects tablica obiektów, których średnią należy obliczyć.
     * @return średnia wartości obiektów
     */
    static double average(Measurable[] objects) {
        return Arrays.asList(objects)
                .stream()
                .mapToDouble(i -> i.getMeasure())
                .sum() / objects.length;
    }
}
