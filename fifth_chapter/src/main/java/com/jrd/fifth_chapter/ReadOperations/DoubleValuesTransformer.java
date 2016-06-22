package com.jrd.fifth_chapter.ReadOperations;

import java.io.IOException;
import java.util.List;

/**
 * Created by jakub on 22.06.16.
 * Rozwiązanie zadania 2
 */
public class DoubleValuesTransformer {

    private DoubleFileReader fileReader;

    public DoubleValuesTransformer(DoubleFileReader fileReader) {
        this.fileReader = fileReader;
    }

    public Double sumOfValues(String fileName) throws IOException, NumberFormatException {
        List<Double> values = fileReader.readValues(fileName);
        return values.stream().mapToDouble(Double::doubleValue).sum();
    }
}
