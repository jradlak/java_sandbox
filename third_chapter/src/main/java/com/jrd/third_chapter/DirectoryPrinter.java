package com.jrd.third_chapter;

import java.io.File;
import java.io.FilenameFilter;
import java.io.PrintStream;
import java.util.Arrays;

/**
 * rozwiązanie zadania 10
 * wyświetlania podkatalogów wskazanego katalogu dwoma metodami:
 * za pomocą klasy anonimowej i wyrażeń lambda
 * Created by jakub on 24.05.16.
 */
public class DirectoryPrinter {

    private static PrintStream ou = System.out;

    public void printDirectory(String dir) {
        File file = new File(dir);

        String[] dirs = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File file, String s) {
                return new File(file + "/" + s).isDirectory();
            }
        });

        String[] dirsLambda = file.list((fl, s) ->
                ((new File(file + "/" + s)).isDirectory())
        );

        Arrays.asList(dirs).stream().forEach(d -> ou.println(d));
        ou.println("\n Dirs lambda: \n");
        Arrays.asList(dirsLambda).stream().forEach(d -> ou.println(d));
    }
}
