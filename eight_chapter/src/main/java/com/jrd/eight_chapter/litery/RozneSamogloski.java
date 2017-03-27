package com.jrd.eight_chapter.litery;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by jakub on 21.03.17.
 */
public class RozneSamogloski {

    private final String plik = "/usr/share/dict/words";

    private final String samogloski3 = "aąeęiuoóy";
    private final String samogloski = "aeiuoy";

    private List<String> slowa;

    public RozneSamogloski() {
        try {
            wczytajSlownik();
        } catch (IOException e) {
            System.out.println("Kurde balans, wzięło i wybuchło: " + e.getMessage());
        }
    }

    private void wczytajSlownik() throws IOException {
        String zawartosc = new String(Files.readAllBytes(Paths.get(plik)));
        slowa = Arrays.asList(zawartosc.split("\\W+"));
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
