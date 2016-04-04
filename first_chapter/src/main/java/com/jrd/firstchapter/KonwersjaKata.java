package com.jrd.firstchapter;

import java.util.Scanner;

/**
 * Created by jakub on 04.04.16.
 */
public class KonwersjaKata {
    public static void normalizujKat() {
        System.out.println("Zadanie 2");
        System.out.print("Wprowadź dowolną liczbę całkowitą: ");
        Scanner in = new Scanner(System.in);
        int liczba = in.nextInt();

        int norm1 = liczba % 360;
        int norm2 = Math.floorMod(liczba, 360);

        System.out.println("Znormalizowany kat, alg 1 = " + norm1);
        System.out.println("Znormalizowany kat, alg 2 = " + norm2);
    }
}
