package com.jrd.firstchapter;

/**
 * Created by jakub on 04.04.16.
 */
public class NajwiekszaNajmniejsza {
    public static void wypiszNajwiekszaINajmniejszaDouble() {

        System.out.println("Zadanie 4");
        System.out.println("Największa liczba dodatnia typu double = " + Double.MAX_VALUE);
        System.out.println("Największa liczba dodatnia typu double, wariant 2 = " + Math.nextUp(Double.MAX_VALUE));

        System.out.println("Najmniejsza liczba dodatnia typu double = " + Math.nextUp(0.0));

    }
}
