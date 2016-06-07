package com.jrd.fourth_chapter.geometry;

/**
 * Rozwiązanie zadania 1 z rozdziału 4
 *
 * Rozwiązanie zadania 2: implementacja metod equals, hashCcode i toString
 * Created by Jakub on 2016-06-07.
 */
public class LabeledPoint extends Point {

    private String label;

    public LabeledPoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }

    public void translate(double deltaX, double deltaY) {
        x += deltaX;
        y += deltaY;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LabeledPoint)) return false;
        if (!super.equals(o)) return false;

        LabeledPoint that = (LabeledPoint)o;

        return getLabel() != null ? getLabel().equals(that.getLabel()) : that.getLabel() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getLabel() != null ? getLabel().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LabeledPoint{" +
                "label='" + label + '\'' +
                "} " + super.toString();
    }
}
