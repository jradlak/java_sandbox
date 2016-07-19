package com.jrd.sixth_chapter.entry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kuba on 2016-07-15.
 */
public class ArrayTools {
    public static <K, V> void append(ArrayList<Entry<K, V>> dest, ArrayList<? extends Entry<K, V>> source) {
        dest.addAll(source);
    }

    /*
     * Rozwiązanie zadania 14 z rozdziału 6
     */
    public static <T extends AutoCloseable> void closeAll(ArrayList<T> elems) throws Exception {
        List<Exception> exx = new ArrayList<>();
        close(elems, exx);

        for (int i = 0; i < exx.size() - 1; i++) {
            exx.get(0).initCause(exx.get(i + 1));
        }

        if (exx.size() > 0) {
            throw exx.get(0);
        }
    }

    private static <T extends AutoCloseable> void close(ArrayList<T> elems, List<Exception> exx) {
        try {
            T elem = elems.get(0);
            if (elems.size() > 1) {
                elems.remove(elem);
                close(elems, exx);
            }

            elem.close();
        } catch (Exception e) {
            exx.add(e);
        }
    }
}
