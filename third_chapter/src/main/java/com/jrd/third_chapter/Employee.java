package com.jrd.third_chapter;

import com.jrd.third_chapter.spec.Measurable;

/**
 * Created by jakub on 21.05.16.
 */
public class Employee implements Measurable {

    private String name;

    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
