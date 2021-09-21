package com.bridgelabz_quantity_measurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1FeetNullValue_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenReferenceCheckForFeet_ShouldReturnEqual() {
        Feet feet1 = new Feet(2.0);
        Assertions.assertTrue(feet1.equals(feet1));
    }

    @Test
    public void givenTypeCheckForFeet_ShouldReturnEquals() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertTrue(feet1.getClass().equals(feet2.getClass()));
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1InchNullValue_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenReferenceCheckForInch_ShouldReturnEqual() {
        Inch inch1 = new Inch(2.0);
        Assertions.assertTrue(inch1.equals(inch1));
    }

    @Test
    public void givenTypeCheckForInch_ShouldReturnEquals() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assertions.assertTrue(inch1.getClass().equals(inch2.getClass()));
    }

    @Test
    public void given1FeetAnd12Inch_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean result = quantityMeasurement.InchConversion(1.0, 12);
        Assertions.assertTrue(result);
    }

    @Test
    public void given0YardAnd0Yard_ShouldReturnEqual() {
        Yard yard1 = new Yard(0.0);
        Yard yard2 = new Yard(0.0);
        Assertions.assertEquals(yard1, yard2);
    }

    @Test
    public void given0YardAnd1Yard_ShouldReturnNotEqual() {
        Yard yard1 = new Yard(0.0);
        Yard yard2 = new Yard(1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given0YardAnd1YardNullValue_ShouldReturnNotEqual() {
        Yard yard1 = new Yard(0.0);
        Yard yard2 = null;
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void givenReferenceCheckForYard_ShouldReturnEqual() {
        Yard yard1 = new Yard(2.0);
        Assertions.assertTrue(yard1.equals(yard1));
    }

    @Test
    public void givenTypeCheckForYard_ShouldReturnEquals() {
        Yard yard1 = new Yard(0.0);
        Yard yard2 = new Yard(0.0);
        Assertions.assertTrue(yard1.getClass().equals(yard2.getClass()));
    }
}