package com.jrd.third_chapter.spec;

/**
 * Created by jakub on 21.05.16.
 */

public interface IntSequence {
    default boolean hasNext() { return true; }
    int next();

    /**
     * Rozwiązanie zadania 4.
     * Metoda zwraca sekwencje elementów przekazanych jako argument
     * @param args
     * @return
     */
    static IntSequence of(int... args) {
        return new IntSequence() {

            private int ints[] = args;

            private int i = 0;

            @Override
            public boolean hasNext() {
                return i != ints.length;
            }

            @Override
            public int next() {
                return ints[i++];
            }
        };
    }

    /**
     * Rozwiązanie zadania 5: zwracanie stałego nieskończonego ciągu
     * @param value
     * @return
     */
    static IntSequence constant(int value) {
        return () -> value;
    }
}