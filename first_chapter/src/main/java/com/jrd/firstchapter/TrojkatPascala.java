package com.jrd.firstchapter;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jakub on 17.04.16.
 *
 * Rozwiązanie zadania 15
 * Zapisuje w tablicy List<List<Integer>> trójkąt pascala dowolnego stopnia n
 */
public class TrojkatPascala {
    private static PrintStream ou = System.out;

    private List<List<Integer>> trojkat = new ArrayList<List<Integer>>();

    public void budujTrojkat(int stopien) {
        trojkat.add(new ArrayList<Integer>(Arrays.asList(new Integer[]{ 1 })));
        trojkat.add(new ArrayList<Integer>(Arrays.asList(new Integer[]{ 1, 1 })));

        for (int i = 2; i < stopien; i++) {
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);

            for (int j = 0; j < i - 1; j++) {
               row.add(trojkat.get(i - 1).get(j) + trojkat.get(i - 1).get(j + 1));
            }

            row.add(1);
            trojkat.add(row);
        }
    }

    public void wypiszTrojkat() {
        ou.println(trojkat.toString());
    }
}
