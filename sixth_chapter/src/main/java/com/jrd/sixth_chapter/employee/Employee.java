package com.jrd.sixth_chapter.employee;

/**
 * Created by jakub on 23.07.16.
 *
 * Rozwiązanie zadania 17 z rozdziału 6
 */
public class Employee implements Comparable<Employee> {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee employee) {
        return name.compareTo(employee.getName());
    }
}
