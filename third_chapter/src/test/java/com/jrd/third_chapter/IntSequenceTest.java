package com.jrd.third_chapter;

import com.jrd.third_chapter.spec.IntSequence;
import org.junit.Assert;
import org.junit.Test;

import java.io.PrintStream;

/**
 * Created by jakub on 21.05.16.
 */
public class IntSequenceTest {
    private static PrintStream ou = System.out;

    @Test
    public void DemoOf() {
        IntSequence seq = IntSequence.of(1, 2, 5);

        int sum = 0;
        while (seq.hasNext()) {
            int val = seq.next();
            sum += val;
            ou.println("seq.next() = " + val);
        }

        Assert.assertTrue(sum == 8);
    }
}