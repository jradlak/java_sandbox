package com.jrd.fifth_chapter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by jakub on 26.06.16.
 *
 * Rozwiązanie zadania 12
 */
public class MinimumFinder {
    public int min(Integer[] array) {
        List<Integer> values = Arrays.asList(array);
        Optional<Integer> vMin = values.stream().min(Integer::compare);
        assert values.stream().allMatch(v -> vMin.get() <= v);
        return vMin.get();
    }
}