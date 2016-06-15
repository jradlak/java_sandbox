package com.jrd.firstchapter;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by jakub on 11.04.16.
 *
 * Zadanie 8: wczytanie ciągu znaków i wypisanie wszystkich jego niepustych podciągów.
 */
public class Podciagi {
    private static PrintStream ou = System.out;

    public static void pobierzLiczbeIWypiszPodciagi() {
        ou.print("Wprowadź dowolny ciąg znaków: ");
        Scanner in = new Scanner(System.in);
        String ciag = in.nextLine();
        wypiszPodciagi(ciag);
    }

    public static void wypiszPodciagi(String ciag) {
        ou.println("Podciąi ciągu " + ciag + ": ");
        int pl =1;
        int cl = ciag.length();
        do {
            for (int i = 0; i <= cl - pl; i += 1) {
                ou.print(ciag.substring(i, i + pl) + ", ");
            }

            pl++;
        } while (pl <= cl);
    }
}
