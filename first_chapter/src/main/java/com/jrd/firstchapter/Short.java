package com.jrd.firstchapter;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by jakub on 06.04.16.
 *
 * Rozwiązanie zadania 7.
 *
 * Wczytuje dwie liczby z zakresu 0 .. 65535 i zapisuje je w typie short.
 * Następnie wykonuje na tych liczbach sumę, różnicę, iloczyn i iloraz i wyniki
 * zapisuje również w liczbach typu short.
 */
public class Short {

    private final static int mx = 65535;

    private static PrintStream ou = System.out;

    public static void dzialania() {
        ou.println("Zadanie 7");

        try {
            short a = wczytajLiczbe();
            short b = wczytajLiczbe();

            wykonajDzialania(a, b);
        } catch (Exception e) {
            ou.println(e.getMessage());
        }
    }

    private static short wczytajLiczbe() throws Exception {
        Scanner in = new Scanner(System.in);
        ou.print("Podaj liczbe z przedziału 0 .. " + mx + ": ");
        int liczba = in.nextInt();
        if (liczba > mx) {
            throw new Exception("Liczba nie może być większa niż " + mx);
        }

        return (short)liczba;
    }

    private static void wykonajDzialania(final short a, final short b) {
        short suma = (short)(a + b);
        ou.println("Suma = " + suma);

        short roznica = (short)(a - b);
        ou.println("Różnica = " + roznica);

        short iloczyn = (short)(a * b);
        ou.println("Iloczyn = " + iloczyn);

        short iloraz = (short)(a / b);
        ou.println("Iloraz = " + iloraz);
    }
}
