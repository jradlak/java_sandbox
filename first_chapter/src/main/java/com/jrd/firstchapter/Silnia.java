package com.jrd.firstchapter;

import java.math.BigInteger;

/**
 * Created by jakub on 06.04.16.
 *
 * Rozwiązania zadania 6.
 * Klasa oblicza silnie dla bardzo dużych liczb wykorzystując obiekt BigInteger
 */
public class Silnia {

    public static void wypiszSilnie(final int n) {
        System.out.println("Silnia liczby " + n + " wynosi: " + obliczSilnie(n).toString());
    }

    public static BigInteger obliczSilnie(final int n) {
        BigInteger result = BigInteger.valueOf(1l);
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

}
