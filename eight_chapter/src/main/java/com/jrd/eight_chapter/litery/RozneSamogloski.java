package com.jrd.eight_chapter.litery;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by jakub on 21.03.17.
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

                    if (!rozneSamogloski
                            .values()
                            .stream()
                            .filter(v -> v.intValue() > 1).findAny().isPresent() &&
                            rozneSamogloski.keySet().size() == 5) {
                        return true;
                    }

                    return false;
                })
                .map(s -> s.stream().collect(Collectors.joining()))
                .collect(Collectors.toSet());
    }
}
