package com.jrd.eight_chapter.litery;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by jakub on 21.03.17.
 *
 * Rozwiązanie zadania 8.
 */
public class RozneSamogloski {

    private final String samogloski3 = "aąeęiuoóy";
    private final String samogloski = "aeiuoy";

    private List<String> slowa;

    public RozneSamogloski(Slownik slownik) {
        slowa = slownik.getSlowa();
    }

    public Set<String> zwrocSlowa() {
        Set<String> samo = new HashSet<>(Arrays.asList(samogloski.split("")));
        return slowa
                .parallelStream()
                .map(s -> Arrays.asList(s.toLowerCase().split("")))
                .filter(l -> {
                    Map<String, Integer> rozneSamogloski = new HashMap<>();
                    for (String sl : l) {
                        if (samo.contains(sl)) {
                            rozneSamogloski.merge(sl, 1, Integer::sum);
                        }
                    }

                    return rozneSamogloski
                            .values()
                            .stream()
                            .noneMatch(v -> v > 1) &&
                            rozneSamogloski.keySet().size() == 5;

                })
                .map(s -> s.stream().collect(Collectors.joining()))
                .collect(Collectors.toSet());
    }
}
