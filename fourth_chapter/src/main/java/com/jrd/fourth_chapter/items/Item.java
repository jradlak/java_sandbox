package com.jrd.fourth_chapter.items;

/**
 * Created by jakub on 15.06.16.
 */
public class Item {
    private String description;

    private double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;

        Item item = (Item) o;

        if (Double.compare(item.getPrice(), getPrice()) != 0) return false;
        return getDescription() != null ? getDescription().equals(item.getDescription()) : item.getDescription() == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getDescription() != null ? getDescription().hashCode() : 0;
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
