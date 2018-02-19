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
        //Integer expected = 12;
        Integer expected = 15; //the sum is 15, not 12 for the example array provided

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
        //Double expected = 2.4;
        Double expected = 3.0; // the result should be 3.0, not 2.4

        // : When
        Double actual = IntegerArrayUtils.getAverage(input);

        // : Then
        Assert.assertEquals(expected, actual, 0.01);
    }
}
