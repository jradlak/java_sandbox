package com.jrd.eight_chapter.litery;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by jakub on 21.03.17.
 */
public class RozneSamogloski {

    private final String plik = "/usr/share/dict/polish";

    private final String samogloski = "aąeęiuoóy";
    private final String samogloski2 = "aeiuoy";

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

    public List<String> zwrocSlowa() {
        List<String> samo = Arrays.asList(samogloski.split(""));
        return slowa
                .parallelStream()
                .map(s -> Arrays.asList(s.toLowerCase().split("")))
                .filter(l -> {
                    Set<String> rozneSamogloski = new HashSet<>();
                    for (String sl : l) {
                        if (samo.contains(sl)) {
                            if (!rozneSamogloski.contains(sl)) {
                                rozneSamogloski.add(sl);
                            }
                        }
                    }

                    if (rozneSamogloski.size() == 5) {
                        return true;
                    }

                    return false;

                })
                .map(s -> s.stream().collect(Collectors.joining()))
                .collect(Collectors.toList());
    }
}
