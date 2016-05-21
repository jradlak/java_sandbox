package com.jrd.third_chapter.spec;

/**
 * Created by jakub on 21.05.16.
 */

public interface IntSequence {
    boolean hasNext();
    int next();

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
}