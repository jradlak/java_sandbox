package com.jrd.third_chapter;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by jakub on 28.05.16.
 */
public class RunnableRunnerTest {
    private Greeter[] greeters;

    @Before
    public void setup() {
        greeters = new Greeter[] {
                new Greeter(4, "greeter1"),
                new Greeter(4, "greeter2"),
                new Greeter(4, "greeter3")
        };
    }

    @Test
    public void testRunnable() {
        RunnableRunner runnableRunner = new RunnableRunner();
        Runnable runner = runnableRunner.getRunner(greeters);
        runner.run();
    }
}