package com.jrd.third_chapter;

/**
 * Created by jakub on 22.05.16.
 */
public class Greeter implements Runnable {
    private int n;

    private String target;

    public Greeter(int n, String target) {
        this.n = n;
        this.target = target;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println(target);
        }
    }
}
