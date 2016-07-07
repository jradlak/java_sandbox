package com.jrd.sixth_chapter.stack;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Kuba on 2016-07-07.
 */
public class StackTest {
    private Stack<String> stack;

    private static final String tvala = "aaaa";
    private static final String tvalb = "bbbb";
    private static final String tvalc = "cccc";

    @Before
    public void setup() {
        stack = new Stack<>();
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
        Stack<String> emptyStack = new Stack<>();
         emptyStack.pop();
    }
}
