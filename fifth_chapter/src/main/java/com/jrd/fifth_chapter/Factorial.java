package com.jrd.fifth_chapter;

/**
 * Created by jakub on 25.06.16.
 */
public class Factorial {
    private static final String msg = "factorial exception, n = ";
    public Long fact(int n) {
        Exception ex = new Exception(msg  + n);
        System.out.println(msg + n);
        ex.printStackTrace();
        if (n == 1) {
            return 1L;
        } else {
            return n * fact(n - 1);
        }
    }
}
