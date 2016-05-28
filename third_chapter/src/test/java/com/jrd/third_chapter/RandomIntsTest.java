package com.jrd.third_chapter;

import com.jrd.third_chapter.spec.IntSequence;
import org.junit.Test;

import java.util.Random;

/**
 * Rozwiązanie zadania 15
 * Created by jakub on 28.05.16.
 */
public class RandomIntsTest {

    @Test
    public void testIntRandomSequence() {
        class RandomSequence implements IntSequence {
            private int low;

            private int high;

            private Random generator = new Random();

            public RandomSequence(int low, int high) {
                this.low = low;
                this.high = high;
            }

            @Override
            public boolean hasNext() {
               return true;
            }

            @Override
            public int next() {
                return low + generator.nextInt(high - low + 1);
            }
        }

        IntSequence randomSequence = new RandomSequence(0, 16);
        System.out.println(randomSequence.next());
    }
}