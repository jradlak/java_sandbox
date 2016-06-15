package com.jrd.third_chapter;

import com.jrd.third_chapter.spec.IntSequence;
import org.junit.Assert;
import org.junit.Test;

import java.io.PrintStream;
import java.util.Random;

/**
 * Created by jakub on 21.05.16.
 */
public class IntSequenceTest {
    private static PrintStream ou = System.out;

    @Test
    public void demoOf() {
        IntSequence seq = IntSequence.of(1, 2, 5);

        int sum = 0;
        while (seq.hasNext()) {
            int val = seq.next();
            sum += val;
            ou.println("seq.next() = " + val);
        }

        Assert.assertTrue(sum == 8);
    }

    @Test
    public void constantTest() {
        IntSequence constantSeq = IntSequence.constant(1);

        Random rnd = new Random();
        int length = rnd.nextInt(Integer.SIZE - 1) % 10000 + 1;
        int curr = constantSeq.next();
        boolean result = true;
        while (length-- != 0) {
            int next = constantSeq.next();
            if (curr != next) {
                result = false;
                break;
            }

            curr = next;
        }

        Assert.assertTrue(result);
    }
}