package com.jrd.third_chapter;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Rozwiązanie zadania 13
 * Created by jakub on 28.05.16.
 */
public class RunnableRunner {
    public Runnable getRunner(Runnable... tasks) {
        return () ->  new ArrayList<>(Arrays.asList(tasks)).stream().forEach(t -> t.run());
    }
}
