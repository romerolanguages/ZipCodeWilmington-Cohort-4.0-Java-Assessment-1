package com.zipcodewilmington.assessment1.part1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtilsTest {
    @Test
    public void getSumTest() {
        // : Given
        Integer[] input = { 1, 2, 3, 4, 5};
        Integer expected = 15;

        // : When
        Integer actual = IntegerArrayUtils.getSum(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetProduct() {
        // : Given
        Integer[] input = { 1, 2, 3, 4, 5};
        Integer expected = 120;

        // : When
        Integer actual = IntegerArrayUtils.getProduct(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageTest() {
        // : Given
        Integer[] input = { 1, 2, 3, 4, 5};
<<<<<<< HEAD
        //Double expected = 2.4;
        Double expected = 3.0; // the result should be 3.0, not 2.4
=======
        Double expected = 3.0;
>>>>>>> f476f0b621b52d7eb0a7e901f81b829891aeff98

        // : When
        Double actual = IntegerArrayUtils.getAverage(input);

        // : Then
        Assert.assertEquals(expected, actual, 0.01);
    }
}
