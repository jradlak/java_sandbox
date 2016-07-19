package com.jrd.sixth_chapter.entry;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Kuba on 2016-07-15.
 */
public class ArrayToolsTest {

    private static final String key1 = "key1";

    private static final String key2 = "key2";

    private static final String val1 = "val1";

    private static final String val2 = "val2";

    @Test
    public void appendArrayEntryTest() {
        ArrayList<Entry<String, String>> dest = new ArrayList<>();
        dest.add(new Entry<>(key1, val1));
        dest.add(new Entry<>(key2, val2));

        ArrayList<Entry<String, String>> source = new ArrayList<>();
        source.add(new Entry<>(key1 + key1, val1 + val1));
        source.add(new Entry<>(key2 + key2, val2 + val2));

        ArrayTools.append(dest, source);

        Assert.assertTrue(dest.size() == 4);
        Assert.assertTrue((val2 + val2).equals(dest.get(3).getValue()));
    }

    @Test
    public void appendArrayEntryExtendedTest() {
        ArrayList<Entry<String, String>> dest = new ArrayList<>();
        dest.add(new EntryExtended<>(key1, val1));
        dest.add(new EntryExtended<>(key2, val2));

        ArrayList<Entry<String, String>> source = new ArrayList<>();
        source.add(new EntryExtended<>(key1 + key1, val1 + val1));
        source.add(new EntryExtended<>(key2 + key2, val2 + val2));

        ArrayTools.append(dest, source);

        Assert.assertTrue(dest.size() == 4);
        Assert.assertTrue((val2 + val2).equals(dest.get(3).getValue()));
    }

    @Test
    public void closeAllTest() {
        ArrayList<Closable> all = new ArrayList<>(Arrays.asList(new Closable[] {
            new Closable(true, "cl1"), new Closable(false, "cl2"),
                new Closable(false, "cl3"), new Closable(true, "cl4")
        }));

        try {
            ArrayTools.closeAll(all);
        } catch (Exception e) {
            printAllCouses(e);
        }
    }

    private void printAllCouses(Throwable e) {
        if (e.getCause() != null) {
            printAllCouses(e.getCause());
        }

        System.out.println(e.getMessage());
    }

    private static class Closable implements AutoCloseable {

        private boolean canClose;

        private String name;

        public Closable(boolean canClose, String name) {
            this.canClose = canClose;
            this.name = name;
        }

        @Override
        public void close() throws Exception {
            if (!canClose) throw new Exception(name + " cannot close.");
        }
    }

}
