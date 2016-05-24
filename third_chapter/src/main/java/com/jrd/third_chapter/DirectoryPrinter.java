package com.jrd.third_chapter;

import java.io.File;
import java.io.FilenameFilter;
import java.io.PrintStream;
import java.util.Arrays;

/**
 * rozwiązanie zadania 10 i 11
 * Zadanie 10:
 * wyświetlania podkatalogów wskazanego katalogu dwoma metodami:
 * za pomocą klasy anonimowej i wyrażeń lambda
 *
 * Zadanie 11:
 * Wypisuje listę plików z danego katalogu o zadanym rozszerzeniu
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

        print(dirs);
        ou.println("\n Dirs lambda: \n");
        print(dirsLambda);
    }

    public void printFiles(String dir, String ext) {
        File file = new File(dir);
        String[] files = file.list((fl, s) -> {
            File ff = new File(file + "/" + s);
            return ff.isFile() && ff.getName().endsWith(ext);
        });

        print(files);
    }

    private static void print(String... names) {
        Arrays.asList(names).stream().forEach(d -> ou.println(d));
    }
}
