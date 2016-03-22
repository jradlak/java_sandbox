package com.jrd.firstchapter;

import java.util.Scanner;

/**
 * Created by jakub on 22.03.16.
 *
 * Rozwiązanie zadania pierwszego:
 *
 * Wczytuje liczbę i przedstawia ją w postaci binarnej, ósemkowej i szesnastkowej, oraz wyświetla jej
 * odwrotność w postaci szesnastkowej liczby zmiennoprzecinkowej
 */
public class SystemyLiczbowe {
    public static void wczytajLiczbeIWypiszWRoznychSystemach() {
        System.out.println("Zadanie 1");
        System.out.print("Wprowadź dowolną liczbę całkowitą: ");
        Scanner in = new Scanner(System.in);
        int liczba = in.nextInt();

        System.out.println("Wczytana liczba w systemie binarnym: " + Integer.toBinaryString(liczba));
        System.out.println("Wczytana liczba w systemie ósemkowym: " + Integer.toOctalString(liczba));
        System.out.println("Wczytana liczba w systemie szesnastkowym: " + Integer.toHexString(liczba));

        System.out.println("Odwrotność liczby w systemie szesnastkowym: " + Double.toHexString(1.0 /liczba));
    }
}
