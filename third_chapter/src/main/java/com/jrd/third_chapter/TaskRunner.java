package com.jrd.third_chapter;

import java.util.Arrays;

/**
 * Rozwiązanie zadania 9: dwie matody:
 * Pierwsza wykonuje równoległe pewien zbiór zadań.
 * Druga ten sam zbiór zadań wykonuje sekwencyjnie
 *
 * Created by jakub on 24.05.16.
 */
public class TaskRunner {
    public void runTogether(Runnable[] tasks) {
        Arrays.asList(tasks).stream().forEach(t -> {
            Thread th = new Thread(t);
            th.start();
        });
    }

    public void runInOrder(Runnable[] tasks) {
        Arrays.asList(tasks).stream().forEach(t -> t.run());
    }
}
