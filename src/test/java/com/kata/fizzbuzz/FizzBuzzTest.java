package com.kata.fizzbuzz;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private static final String ONE = "1";
    private static final String TWO = "2";
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void fizzBuzzShouldReturn1For1(){
        Assert.assertThat(fizzBuzz.getFizzBuzz(1), Is.is(ONE));
    }

    @Test
    public void fizzBuzzShouldReturn2For2() {
        Assert.assertThat(fizzBuzz.getFizzBuzz(2), Is.is(TWO));
    }
}