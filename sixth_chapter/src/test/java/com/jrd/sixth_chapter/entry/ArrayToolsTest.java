package com.jrd.sixth_chapter.entry;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

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

}
