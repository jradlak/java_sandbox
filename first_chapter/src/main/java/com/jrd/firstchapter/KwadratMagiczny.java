package com.jrd.firstchapter;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Kuba on 2016-04-15.
 *
 * Rozwiązanie zadania 14
 * Wczytuje z pliku tablicę liczb całkowitych i ustala czy jest kwadratem magicznym
 */
public class KwadratMagiczny {

    private final static String fileName = "C:\\Users\\Kuba\\Documents\\kwadrat.txt";

    private static PrintStream ou = System.out;

    public static void sprawdzMagiczny() {
        List<List<String>> k = wczytajKwadrat();
        int sumaPion = 0;
        int sumaPoziom = 0;
        int sumaPrzek1 = 0;
        int sumaPrzek2 = 0;
        int sumaStart = 0;
        int l = k.size() - 1;
        for (int i = 0; i < k.size(); i++) {
            sumaPion = sumaPoziom = 0;
            for (int j = 0; j < k.get(i).size(); j++) {
                sumaPion += Integer.parseInt(k.get(i).get(j));
                sumaPoziom += Integer.parseInt(k.get(j).get(i));
            }

            if (i == 0) {
                sumaStart = sumaPion;
            }

            if (sumaPion != sumaStart || sumaPoziom != sumaStart) {
                ou.println("nie magiczny");
                return;
            }

            sumaPrzek1 += Integer.parseInt(k.get(i).get(i));
            sumaPrzek2 += Integer.parseInt(k.get(l - i).get(i));
        }

        if (sumaPrzek1 != sumaStart || sumaPrzek2 != sumaStart) {
            ou.println("nie magiczny");
            return;
        }

        ou.println("Magiczny!!!");
        return;
    }

    public static List<List<String>> wczytajKwadrat() {
        List<List<String>> kwadrat = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(k -> kwadrat.add(new ArrayList<>(Arrays.asList(k.split(",")))));
            ou.println(kwadrat.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return kwadrat;
    }
}
