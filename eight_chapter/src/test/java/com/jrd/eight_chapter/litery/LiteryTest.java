package com.jrd.eight_chapter.litery;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;

/**
 * Created by jakub on 29.11.16.
 */
public class LiteryTest {

    @Test
    public void literyTest() {
        Stream<String> lit = Litery.litery("abcdefgh");
        lit.forEach(l -> System.out.println(l));
        Assert.assertTrue(lit != null);
    }
}
