package com.jrd.second_chapter;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by jakub on 08.05.16.
 */
public class InvoiceTest {

    private Invoice invoice;

    @Before
    public void setup() {
        invoice = new Invoice();
        invoice.add(new Invoice.Item("produkt 1", 10, 12.5));
        invoice.add(new Invoice.Item("produkt 2", 11, 13.5));
    }

    @Test
    public void shouldInvoiceBePrintedCorrectly() {
        String invoiceStr = invoice.toString();
        System.out.println(invoiceStr);
    }
}