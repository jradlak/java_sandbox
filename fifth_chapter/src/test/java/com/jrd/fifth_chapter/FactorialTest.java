package com.jrd.fifth_chapter;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jakub on 25.06.16.
 *
 * Rozwiązanie zadania 10 z rozdziału 5
 */
public class FactorialTest {

    @Test
    public void testFactorial() {
        Factorial factorial = new Factorial();
        Long result = factorial.fact(5);

        Assert.assertTrue(result == 120L);
    }
}
