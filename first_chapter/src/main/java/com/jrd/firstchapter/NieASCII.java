package com.jrd.firstchapter;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by jakub on 14.04.16.
 *
 * Rozwiązanie zadania 11
 *
 * Wczytaj dowolną linię i wypisz znaki nie będące w niej znakami ASCII i podaj ich kody unicode
 *
 */
public class NieASCII {
    private static PrintStream ou = System.out;

    public static void wczytajIWypiszUnicode() {
        String linia = wczytajLinie();
        ou.println("");
        for (int i = 0; i < linia.length(); i++) {
            if (linia.charAt(i) > 255) {
                ou.printf("%u", linia.charAt(i) + "");
            }
        }
    }

    private static String wczytajLinie() {
        ou.print("Wprowadź linię tekstu: ");
        Scanner in = new Scanner(System.in);
        String linia = in.nextLine();
        return linia;
    }
}
