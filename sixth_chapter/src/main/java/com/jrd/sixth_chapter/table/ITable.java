package com.jrd.sixth_chapter.table;


/**
 * Created by Kuba on 2016-07-11.
 */
public interface ITable<K, V> {
    V get(K key) throws Exception;

    void add(K key, V value);

    void set(K key, V value) throws Exception;

    void delete(K key) throws Exception;
}
