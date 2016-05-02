package com.jrd.second_chapter;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jakub on 02.05.16.
 */
public class CarTest {
    private Car car;

    @Test
    public void przejedzDystansTest() {
        this.car = new Car(5.0);
        this.car.zatankuj(45.0);
        car.przejedz(300.0);
        Assert.assertTrue(car.getDystans() == 300);
        Assert.assertTrue(car.getPaliwo() == 30);
    }

    @Test
    public void zabrakloPaliwaTest() {
        this.car = new Car(6.0);
        this.car.zatankuj(45.0);
        car.przejedz(1000);
        Assert.assertTrue(car.getPaliwo() == 0);
        Assert.assertTrue(car.getDystans() == 750);
    }
}
