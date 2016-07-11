package com.jrd.sixth_chapter.table;

import com.jrd.sixth_chapter.table.inner.TableInner;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Kuba on 2016-07-09.
 */
public class TableTest {

    @Test
    public void fillTableTest() throws Exception {
        fillTableTest(new Table<String, String>());
        fillTableTest(new TableInner<String, String>());
    }

    @Test(expected = Exception.class)
    public void keyNoPresentTest() throws Exception {
        keyNoPresentTest(new Table<String, String>());
    }

    @Test(expected = Exception.class)
    public void keyNoPresentTestInner() throws Exception {
        keyNoPresentTest(new TableInner<String, String>());
    }

    public void fillTableTest(ITable<String, String> table) throws Exception {
        for (int i = 1; i <= 3; i++) {
            table.add("klucz" + i, "wart" + i);
        }

        table.set("klucz2", "wart2mod");
        for (int i = 1; i <= 3; i+=2) {
            Assert.assertTrue(("wart" + i).equals(table.get("klucz" + i)));
        }

        Assert.assertTrue(("wart2mod" ).equals(table.get("klucz2")));
    }

    public void keyNoPresentTest(ITable<String, String> table) throws Exception {
        table.set("noPresent", "bla");
    }
}
