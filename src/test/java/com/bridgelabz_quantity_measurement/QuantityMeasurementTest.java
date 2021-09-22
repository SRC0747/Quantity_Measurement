package com.bridgelabz_quantity_measurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1FeetNullValue_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenReferenceCheckForFeet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 2.0);
        Assertions.assertTrue(feet1.equals(feet1));
    }

    @Test
    public void givenTypeCheckForFeet_ShouldReturnEquals() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        Assertions.assertTrue(feet1.getClass().equals(feet2.getClass()));
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1InchNullValue_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenReferenceCheckForInch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 2.0);
        Assertions.assertTrue(inch1.equals(inch1));
    }

    @Test
    public void givenTypeCheckForInch_ShouldReturnEquals() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        Assertions.assertTrue(inch1.getClass().equals(inch2.getClass()));
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEquals() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Assertions.assertNotEquals(feet1, inch1);
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

    @Test
    public void given3FeetAnd1Yard_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean result = quantityMeasurement.YardConversion(3.0, 1.0);
        Assertions.assertTrue(result);
    }

    @Test
    public void given1YardAnd36Inch_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean result = quantityMeasurement.YardToInchConversion(1.0, 36.0);
        Assertions.assertTrue(result);
    }

    @Test
    public void given0CentimeterAnd0Centimeter_ShouldReturnEqual() {
        Centimeter centimeter1 = new Centimeter(0.0);
        Centimeter centimeter2 = new Centimeter(0.0);
        Assertions.assertEquals(centimeter1, centimeter2);
    }

    @Test
    public void given0CentimeterAnd1Centimeter_ShouldReturnNotEqual() {
        Centimeter centimeter1 = new Centimeter(0.0);
        Centimeter centimeter2 = new Centimeter(1.0);
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void given0CentimeterAnd1CentimeterNullValue_ShouldReturnNotEqual() {
        Centimeter centimeter1 = new Centimeter(0.0);
        Centimeter centimeter2 = null;
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void givenReferenceCheckForCentimeter_ShouldReturnEqual() {
        Centimeter centimeter1 = new Centimeter(2.0);
        Assertions.assertTrue(centimeter1.equals(centimeter1));
    }

    @Test
    public void givenTypeCheckForCentimeter_ShouldReturnEquals() {
        Centimeter centimeter1 = new Centimeter(0.0);
        Centimeter centimeter2 = new Centimeter(0.0);
        Assertions.assertTrue(centimeter1.getClass().equals(centimeter2.getClass()));
    }

    @Test
    public void given2InchAnd5Centimeter_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean result = quantityMeasurement.InchToCentimeterConversion(1.0, 2.54);
        Assertions.assertTrue(result);
    }
}