package com.jrd.sixth_chapter.table;

import com.jrd.sixth_chapter.entry.Entry;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by Kuba on 2016-07-09.
 *
 * Rozwiązanie zadanie 3 z rozdziału 6
 */
public class Table<K, V> implements ITable<K, V> {
    private List<Entry<K, V>> list;

    public Table() {
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
}
