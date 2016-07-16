package com.jrd.sixth_chapter.entry;

/**
 * Created by Kuba on 2016-07-15.
 */
public class EntryExtended<K, V> extends Entry<K, V> {

    private String extended = "";

    public EntryExtended(K key, V value) {
        super(key, value);
        this.extended = "extended";
    }

    public String getExtended() {
        return extended;
    }
}
