package com.jrd.seventh_chapter.niemodyfikowalne;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by jradl on 04.10.2016.
 */
public class ListaWidokTest {
    @Test
    public void zwrocNiemodyfikowalnaListeTest() {
        List<Integer> lista = ListaWidok.zwrocNiemodyfikowalnaListe(10);
        System.out.println(lista);
        Assert.assertTrue(10 == lista.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void probaModyfikacjiListy() throws UnsupportedOperationException {
        List<Integer> lista = ListaWidok.zwrocNiemodyfikowalnaListe(10);
        lista.add(11);
    }
}
