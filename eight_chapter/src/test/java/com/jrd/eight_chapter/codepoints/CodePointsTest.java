package com.jrd.eight_chapter.codepoints;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jakub on 29.11.16.
 */
public class CodePointsTest {

    @Test
    public void testTylkoLitery() {
        boolean tylkoLitery = CodePoints.tylkoLitery("jakiesLiterki");
        Assert.assertTrue(tylkoLitery);
    }

    @Test
    public void testNieTylkoLitery() {
        boolean nieTylkoLitery = CodePoints.tylkoLitery("jakies123NieTylko456Literki");
        Assert.assertTrue(!nieTylkoLitery);
    }

    @Test
    public void testPoprawnyIdentJava() {
        boolean poprawnyIdent = CodePoints.poprawnyIdentyfikatorJava("tojestIdent1");
        Assert.assertTrue(poprawnyIdent);
    }
}
