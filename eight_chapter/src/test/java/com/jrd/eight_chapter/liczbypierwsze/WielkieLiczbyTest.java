package com.jrd.eight_chapter.liczbypierwsze;

import org.junit.Test;

import java.math.BigInteger;

/**
 * Created by jakub on 26.06.18.
 */
public class WielkieLiczbyTest {
    private WielkieLiczby wielkieLiczby;

    @Test
    public void testujGenerator() {
        wielkieLiczby = new WielkieLiczby();

        BigInteger number = wielkieLiczby.generatePrime(164);
        System.out.println(number);
    }
}
