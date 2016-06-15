package com.jrd.fourth_chapter.items;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jakub on 15.06.16.
 */
public class DiscountedItemTest {

    @Test
    public void testujNieprzechodnioscRelacjiEquals() {
        Item x = new DiscountedItem("x", 10);
        Item y = new Item("x", 10);
        Item z = new DiscountedItem("x", 10, 1);

        Assert.assertTrue(x.equals(y) && y.equals(z));
        Assert.assertTrue(!x.equals(z));
    }
}
