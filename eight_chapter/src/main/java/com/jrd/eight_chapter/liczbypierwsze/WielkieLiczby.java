package com.jrd.eight_chapter.liczbypierwsze;

import java.math.BigInteger;
import java.util.Random;

/**
 * Created by jakub on 26.06.18.
 *
 * Rozwiązanie zadania 15 z rozdziału 8
 */
public class WielkieLiczby {

    BigInteger generatePrime(int bits) {
        return BigInteger.probablePrime(bits, new Random());
    }
}
