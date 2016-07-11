package com.jrd.sixth_chapter.table.inner;

import com.jrd.sixth_chapter.table.ITable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by Kuba on 2016-07-11.
 *
 * Rozwiązanie zadania 4 z rozdziału 6
 */
public class TableInner<K, V>  implements ITable<K, V> {

    private List<Entry<K, V>> list;

    public TableInner() {
        list = new ArrayList<>();
    }

    public V get(K key) throws Exception {
        return findEntry(key).getValue();
    }

    public void add(K key, V value) {
        list.add(new Entry<K, V>(key, value));
    }

    public void set(K key, V value) throws Exception {
        findEntry(key).setValue(value);
    }

    public void delete(K key) throws Exception {
        list.remove(findEntry(key));
    }

    private Entry<K, V> findEntry(K key) throws Exception {
        Optional<Entry<K, V>> entry = getEntry(key);
        if (!entry.isPresent()) {
            throw new Exception("Key " + key + " not present");
        }

        return entry.get();
    }

    private Optional<Entry<K, V>> getEntry(K key) {
        return list
                .stream()
                .filter(e -> e.getKey().equals(key))
                .findFirst();
    }

    private static class Entry<K, V> {
        private K key;

        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
