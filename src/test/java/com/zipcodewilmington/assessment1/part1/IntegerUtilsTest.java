package com.zipcodewilmington.assessment1.part1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtilsTest {
    @Test
    public void getSumTest() {
        // : Given
        Integer input = 5;
        //Integer expected = 12;
        Integer expected = 10; // expected should equal 10, not 12 (sum of 0+1+2+3+4, not including 5)


        // : When
        Integer actual = IntegerUtils.getSumOfN(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetProduct() {
        // : Given
        Integer input = 5;
        //Integer expected = 120;
        Integer expected = 24; // expected should equal 24, not 120 (product of 1*2*3*4, not including 5)
        // expected cannot include the value 0 in the multiplication (otherwise the product would always = 0)

        // : When
        Integer actual = IntegerUtils.getProductOfN(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseDigitsTest() {
        // : Given
        Integer input = 12345;
        Integer expected = 54321;

        // : When
        Integer actual = IntegerUtils.reverseDigits(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }
}
