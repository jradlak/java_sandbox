package com.jrd.third_chapter;

import com.jrd.third_chapter.spec.Measurable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
}
