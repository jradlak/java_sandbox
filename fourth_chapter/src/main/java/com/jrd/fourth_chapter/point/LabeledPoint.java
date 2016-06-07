package com.jrd.fourth_chapter.point;

/**
 * Rozwiązanie zadania 1 z rozdziału 4
 * Created by ThinkPad on 2016-06-07.
 */
public class LabeledPoint extends Point {

    private String label;

    public LabeledPoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
