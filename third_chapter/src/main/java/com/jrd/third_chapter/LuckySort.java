package com.jrd.third_chapter;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Rozwiązanie zadania 7: sortowanie tablicy znaków tak długo, aż będzie uporządkowana rosnąco
 * Created by jakub on 21.05.16.
 */
public class LuckySort {

    private static PrintStream ou = System.out;

    public static ArrayList<String> luckySort(ArrayList<String> strings, Comparator<String> comp) {
        while (!areStringsOrdered(strings, comp)) {
            Collections.shuffle(strings);
            ou.println(strings);
        }

        return strings;
    }

    private static boolean areStringsOrdered(ArrayList<String> strings, Comparator<String> comp) {
        String curr = strings.get(0);
        for(String s :strings) {
            if (comp.compare(curr, s) > 0) {
                return false;
            }
            curr = s;
        }

        return true;
    }
}
