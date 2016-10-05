package com.jrd.seventh_chapter.Cache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by jradl on 05.10.2016.
 */
public class Cache<K, V> extends LinkedHashMap<K, V> {

    private int maxSize = 0;

    public Cache(int maxSize) {
        super(maxSize);
        this.maxSize = maxSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return super.size() > this.maxSize;
    }
}
