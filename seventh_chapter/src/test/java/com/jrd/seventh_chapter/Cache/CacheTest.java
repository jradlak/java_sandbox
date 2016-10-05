package com.jrd.seventh_chapter.Cache;

import org.junit.Test;

/**
 * Created by jradl on 05.10.2016.
 */
public class CacheTest {

    @Test
    public void testujCacheOStalymRozmiarze() {
        Cache<String, String> cache = new Cache<>(4);
        cache.put("k1", "v1");
        cache.put("k2", "v2");
        cache.put("k3", "v3");
        cache.put("k4", "v4");
        cache.put("k5", "v5");
        cache.put("k6", "v6");
        
        System.out.println("Cache = " + cache);
    }
}
