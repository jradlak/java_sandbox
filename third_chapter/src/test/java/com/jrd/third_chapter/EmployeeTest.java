package com.jrd.third_chapter;

import com.jrd.third_chapter.spec.Measurable;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by jakub on 21.05.16.
 */
public class EmployeeTest {

    Measurable employees[];

    @Before
    public void setup() {
        employees = new Measurable[] {
                new Employee("prac1", 100),
                new Employee("prac2", 300),
                new Employee("prac3", 250)
        };
    }

    @Test
    public void avarageTest() {
        double avarage = Measurable.average(employees);
        Assert.assertTrue(avarage == 650 / 3.0);
    }

    @Test
    public void largestSalaryTest() {
        Employee largest = (Employee)Measurable.largest(employees);
        Assert.assertTrue("prac2".equals(largest.getName()));
    }

    /**
     * Rozwiązanie zadania 14
     */
    @Test
    public void employeeSortTest() {
        Employee[] sortEmpls = new Employee[] {
                new Employee("prac1", 100),
                new Employee("prac2", 300),
                new Employee("prac4", 250),
                new Employee("prac3", 250)
        };

        Comparator<Employee> c = (p, o) -> ((int)p.getMeasure() - (int)o.getMeasure());
        Arrays.sort(sortEmpls, c.thenComparing(
                (p, q) -> (p.getName().compareTo(q.getName()))
        ));

        Arrays.asList(sortEmpls).stream().forEach(System.out::println);
    }
}
