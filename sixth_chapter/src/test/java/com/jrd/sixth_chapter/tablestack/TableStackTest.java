package com.jrd.sixth_chapter.tablestack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Kuba on 2016-07-07.
 */
public class TableStackTest {
    private Stack<String> stack;

    private static final String tvala = "aaaa";
    private static final String tvalb = "bbbb";
    private static final String tvalc = "cccc";

    @Before
    public void setup() {
        stack = new Stack<>(String.class);
    }

    @Test
    public void testStack() throws Exception {
        stack.push(tvala);
        stack.push(tvalb);
        stack.push(tvalc);

        String valc = stack.pop();
        String valb = stack.pop();
        String vala = stack.pop();

        Assert.assertTrue(tvalc.equals(valc));
        Assert.assertTrue(tvalb.equals(valb));
        Assert.assertTrue(tvala.equals(vala));
    }

    @Test(expected = Exception.class)
    public void testEmptyStack() throws Exception {
        Stack<String> emptyStack = new Stack<>(String.class);
        emptyStack.pop();
    }

    @Test
    public void testStackConsistency() throws Exception {
        ArrayList<String> testList = new ArrayList<>();
        Stack<String> consistentStack = new Stack<>(String.class);
        int n = 201;
        for (int i = 0; i < n; i++) {
            String elm = "test" + i;
            testList.add(elm);
            consistentStack.push(elm);
        }

        for (int i = n - 1; i >= 0; i--) {
            String testVal = testList.get(i);
            String currentVal = consistentStack.pop();
            Assert.assertTrue(testVal.equals(currentVal));
        }
    }
}
