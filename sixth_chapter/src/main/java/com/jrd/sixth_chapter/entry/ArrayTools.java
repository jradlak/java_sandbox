package com.jrd.sixth_chapter.entry;

import java.util.ArrayList;

/**
 * Created by Kuba on 2016-07-15.
 */
public class ArrayTools {
    public static <K, V> void append(ArrayList<Entry<K, V>> dest, ArrayList<? extends Entry<K, V>> source) {
        dest.addAll(source);
    }
}
