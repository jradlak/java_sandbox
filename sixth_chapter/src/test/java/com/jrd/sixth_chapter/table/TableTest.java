package com.jrd.sixth_chapter.table;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Kuba on 2016-07-09.
 */
public class TableTest {

    @Test
    public void fillTableTest() throws Exception {
        Table<String, String> table = new Table<>();

        for (int i = 1; i <= 3; i++) {
            table.add("klucz" + i, "wart" + i);
        }

        table.set("klucz2", "wart2mod");
        for (int i = 1; i <= 3; i+=2) {
            Assert.assertTrue(("wart" + i).equals(table.get("klucz" + i)));
        }

        Assert.assertTrue(("wart2mod" ).equals(table.get("klucz2")));
    }

    @Test(expected = Exception.class)
    public void keyNoPresentTest() throws Exception {
        Table<String, String> table = new Table<>();
        table.set("noPresent", "bla");
    }
}
