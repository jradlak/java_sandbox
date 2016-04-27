package com.jrd.firstchapter;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        //SystemyLiczbowe.wczytajLiczbeIWypiszWRoznychSystemach();
        //KonwersjaKata.normalizujKat();
        //TrzyLiczby.wybierzNajwieksza();
        //NajwiekszaNajmniejsza.wypiszNajwiekszaINajmniejszaDouble();
        //Zadanie5.rzutowanie();
        //Silnia.wypiszSilnie(1000);

        //Short.dzialania();
        //Podciagi.pobierzLiczbeIWypiszPodciagi();
        //NieASCII.wczytajIWypiszUnicode();
        // trójkąt pascala:
        //TrojkatPascala tp = new TrojkatPascala();
        //tp.budujTrojkat(7);
        //tp.wypiszTrojkat();

        //KwadratMagiczny.sprawdzMagiczny();

        //Lotto:
        Lotto lotto = new Lotto();
        System.out.println(lotto.losowanie().toString());
    }
}
