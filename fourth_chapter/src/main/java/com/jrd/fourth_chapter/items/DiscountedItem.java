package com.jrd.fourth_chapter.items;

/**
 * Created by jakub on 15.06.16.
 */
public class DiscountedItem extends Item {

    private double discount;

    public DiscountedItem(String description, double price) {
        super(description, price);
        discount = 0;
    }

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof DiscountedItem) {
            DiscountedItem that = (DiscountedItem) o;
            return super.equals(o) && Double.compare(that.getDiscount(), getDiscount()) == 0;
        } else if (o instanceof Item) {
            return super.equals(o);
        }

        return false;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(getDiscount());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
