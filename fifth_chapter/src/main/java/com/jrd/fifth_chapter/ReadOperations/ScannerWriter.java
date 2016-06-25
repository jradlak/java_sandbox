package com.jrd.fifth_chapter.ReadOperations;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by jakub on 25.06.16.
 *
 * Rozwiązanie zadania 5 z rozdziału 5
 */
public class ScannerWriter {
    public void scanFile(String fileName) {

        Scanner in = null;
        PrintWriter out = null;
        try {
            in = new Scanner(Paths.get(fileName));
            out = new PrintWriter("output.txt");
            while (in.hasNext()) {
                out.println(in.next().toLowerCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            out.close();
            in.close();
        }
    }
}
