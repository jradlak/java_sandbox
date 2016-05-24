package com.jrd.third_chapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakub on 21.05.16.
 */
public class App {

    private final static int numberOfTasks = 4;

    private final static int numberOfIterations = 1000;

    public static void main(String[] args) {
        System.out.println("Hello third chapter!!!");

        //greeterTest();

        //taskRunnerTest();
        printDirectoryTest();
    }

    private static void greeterTest() {
        Runnable gr1 = new Greeter(1000, "Chewbacca");
        Runnable gr2 = new Greeter(1000, "Sokół Millennium");

        Thread th1 = new Thread(gr1);
        Thread th2 = new Thread(gr2);

        th1.start();
        th2.start();
    }

    private static void taskRunnerTest() {
        List<Runnable> tasks = new ArrayList<>();
        for (int i = 0; i < numberOfTasks; i++) {
            tasks.add(new Greeter(numberOfIterations, "task + " + i));
        }

        TaskRunner taskRunner = new TaskRunner();
        taskRunner.runInOrder(tasks.stream().toArray(Greeter[]::new));
        taskRunner.runTogether(tasks.stream().toArray(Greeter[]::new));
    }

    private static void printDirectoryTest() {
        DirectoryPrinter directoryPrinter = new DirectoryPrinter();
        //directoryPrinter.printDirectory("/home/jakub");

        directoryPrinter.printFiles("/home/jakub", ".log");
    }
}
