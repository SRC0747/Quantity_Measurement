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
    public void given0FeetAnd1FeetReference_ShouldReturnEqual() {
        Feet feet1 = new Feet(2.0);
        Assertions.assertTrue(feet1.equals(feet1));
    }

    @Test
    public void givenTypeCheckForFeet_ShouldReturnEquals() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertTrue(feet1.getClass().equals(feet2.getClass()));
    }
}