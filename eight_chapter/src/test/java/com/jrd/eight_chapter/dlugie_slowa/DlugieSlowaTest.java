package com.jrd.eight_chapter.dlugie_slowa;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by javadev on 11.10.16.
 */
public class DlugieSlowaTest {

    private final static int n = 5;

    private final static int k = 5;

    private String[] slowa = {
            "Jakub",
            "Michał",
            "Tom",
            "Małgorzata",
            "Henryk",
            "Grzegorz",
            "Urszula",
            "Marzena",
            "Barbara",
            "Tomasz"
    };

    @Test
    public void testujDlugieSlowa() {
        List<String> listaSlow = Arrays.asList(slowa);
        List<String> slowaPrzefiltrowane = listaSlow.stream()
                .filter(s -> s.length() > n)
                .peek(s -> System.out.println(s))
                .limit(k)
                .collect(Collectors.toList());

        System.out.println("Słowa przefiltrowane = " + slowaPrzefiltrowane);
    }
}
