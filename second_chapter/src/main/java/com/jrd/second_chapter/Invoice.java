package com.jrd.second_chapter;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Created by jakub on 08.05.16.
 *
 * Rozwiązanie zaania 15 z rozdziału 2
 * Implementacja Klasy Invoice z rozdziału 2.6.1 "Zagnieżdżone klasy statyczne".
 * Dodanie metody wyświetlającej fakturę. W osobnej klasie program testowy / demonstracyjny,
 * który tworzy i wyświetla przykładową fakturę.
 */
public class Invoice {
    public static class Item {
        private String description;
        private int quantity;
        private double unitPrice;

        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

        public double price() {
            return quantity * unitPrice;
        }

        public String getDescription() {
            return description;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getUnitPrice() {
            return unitPrice;
        }
    }

    private ArrayList<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    @Override
    public String toString() {
        String result = "Invoice items \n";
        result += "--------------------\n";
        result += "description \t | quantity \t | unit price \t | price \t \n";
        result += "----------------------------------------------------------- \n";

        result += items.stream().map(e -> e.getDescription() + " \t\t | "
                + e.getQuantity() + " \t\t\t | " + e.getUnitPrice() + " \t\t | "
                + e.price() + "\n")
                .collect(Collectors.toList()).toString().replace("[", "").replace("]", "").replace(",", "");

        return result;
    }
}
