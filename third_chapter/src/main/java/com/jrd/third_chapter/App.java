package com.jrd.third_chapter;

/**
 * Created by jakub on 21.05.16.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello third chapter!!!");

        greeterTest();
    }

    private static void greeterTest() {
        Runnable gr1 = new Greeter(1000, "Chewbacca");
        Runnable gr2 = new Greeter(1000, "Sokół Millennium");

        Thread th1 = new Thread(gr1);
        Thread th2 = new Thread(gr2);

        th1.start();
        th2.start();
    }
}
