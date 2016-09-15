package com.jrd.seventh_chapter.zdania;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Kuba on 2016-09-15.
 */
public class TasowatorZdanTest {
    private String[] zdania = {
            "Litwo! Ojczyzno moja! ty jesteś jak zdrowie.",
            "Ile cię trzeba cenić, ten tylko się dowie, kto cię stracił.",
            "Dziś piękność twą w całej ozdobie widzę i opisuję, bo tęsknię po tobie."
    };

    private TasowatorZdan tasowatorZdan;

    @Before
    public void setup() {
        tasowatorZdan = new TasowatorZdan(Arrays.asList(zdania));
    }

    @Test
    public void testujTasowanieZdan() {
        Collection<String> potasowane = tasowatorZdan.tasuj();
        System.out.println(potasowane.toString());
    }
}
