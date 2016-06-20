package com.jrd.fifth_chapter.ReadOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by jakub on 20.06.16.
 *
 * Rozwiązanie zadania 1:
 * Przeczytanie pliku zawierającego liczby double i zwrócenie listy tych liczb.
 * Jeśli konieczne, wyrzucanie stosownych wyjątków w zależności od sytuacji.
 */
public class DoubleFileReader {
    public List<Double> readValues(String fileName) throws IOException, NumberFormatException {
        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            return lines.map(v -> Double.parseDouble(v))
                    .collect(Collectors.toList());
        } catch (IOException | NumberFormatException e) {
            throw e;
        }
    }
}
