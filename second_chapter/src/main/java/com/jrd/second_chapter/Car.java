package com.jrd.second_chapter;

/**
 * Rozwiązanie zadania 9 z rozdziału 2
 * Created by jakub on 02.05.16.
 */
public class Car {

    private static final double pojemnoscBaku = 45;

    /**
     * Spalanie w litrach na 100 km.
     */
    private double spalanie;

    private double paliwo;

    private double dystans;

    public Car(double spalanie) {
        this.spalanie = spalanie;
    }

    public double getDystans() {
        return dystans;
    }

    public double getPaliwo() {
        return paliwo;
    }

    public void zatankuj(double paliwo) {
        if (this.paliwo + paliwo <= pojemnoscBaku) {
            this.paliwo += paliwo;
        }
    }

    public void przejedz(double dystans) {
        double spalone = spalanie * dystans / 100;
        if (paliwo - spalone > 0) {
            paliwo -= spalone;
            this.dystans += dystans;
        } else {
            double przejechal = paliwo / spalanie * 100;
            this.dystans += przejechal;
            paliwo = 0;
        }
    }
}
