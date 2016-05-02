package com.jrd.second_chapter;

import au.com.bytecode.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Rozwiązanie zadania 13 z rozdziału 2
 * 
 * Created by jakub on 02.05.16.
 */
public class Csv {

    private static PrintStream ou = System.out;

    public static void printCsv(String fileName) throws IOException {
        CSVReader reader = new CSVReader(new FileReader(fileName));
        String [] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            for (String s : nextLine) {
                ou.print(s + ", ");
            }

            ou.println();
        }
    }
}
