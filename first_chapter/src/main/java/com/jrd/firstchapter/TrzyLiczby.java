package com.jrd.firstchapter;

import java.util.Scanner;

/**
 * Created by jakub on 04.04.16.
 */
public class TrzyLiczby {

    public static void wybierzNajwieksza() {
        Scanner in = new Scanner(System.in);
        System.out.println("Zadanie 3");

        System.out.print("Wprowadź pierwszą liczbę: ");
        int a = in.nextInt();

        System.out.print("Wprowadź drugą liczbę: ");
        int b = in.nextInt();

        System.out.print("Wprowadź trzecią liczbę: ");
        int c = in.nextInt();

        System.out.println("Największa liczba, alg1 = " +wybierzNajwiekszaIf(a, b, c));
        System.out.println("Największa liczba, alg2 = " +wybierzNajwiekszaMath(a, b, c));

    }

    private static int wybierzNajwiekszaIf(final int a, final int b, final int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }

    private static int wybierzNajwiekszaMath(final int a, final int b, final int c) {
        return Math.max(a, Math.max(b, c));
    }
}
