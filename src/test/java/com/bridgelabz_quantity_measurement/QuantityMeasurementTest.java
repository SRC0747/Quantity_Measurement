package com.bridgelabz_quantity_measurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuantityMeasurementTest {
    @Test
    void given0FeetAnd0Feet_ShouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Length.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Length.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0FeetAndNull_ShouldReturnNotEquals() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET, 0.0);
        QuantityMeasurement feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0FeetAnd0FeetFromDiffRef_ShouldReturnNotSameRef() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Length.FEET, 0.0);
        Assertions.assertNotSame(feet1, feet2);
    }

    @Test
    void given0InchAnd0Inch_ShouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Length.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    void given0InchAnd1Inch_ShouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Length.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void given0InchAndNull_ShouldReturnNotEquals() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 0.0);
        QuantityMeasurement inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }
    @Test
    void givenInchAndInchFromDiffRef_ShouldReturnNotSame() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Length.INCH, 0.0);
        Assertions.assertNotSame(inch1, inch2);
    }

    @Test
    void given0FeetAnd0Inch_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 0.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0FeetAnd1Inch_WhenCompared_ShouldReturnFalse() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 0.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1FeetAnd12Inch_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given12InchAnd1Feet_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 12.0);
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1InchAnd1Feet_WhenCompared_ShouldReturnFalse() {
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 1.0);
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1FeetAnd1Inch_WhenCompared_ShouldReturnFalse() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given0YardAnd0Yard_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Length.YARD, 0.0);
        QuantityMeasurement yard2 = new QuantityMeasurement(Length.YARD, 0.0);
        boolean compareCheck = yard1.compare(yard2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0YardAnd1Yard_WhenCompared_ShouldReturnFalse() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Length.YARD, 0.0);
        QuantityMeasurement yard2 = new QuantityMeasurement(Length.YARD, 0.0);
        boolean compareCheck = yard1.compare(yard2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0YardAndNull_ShouldReturnNotEqual() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Length.YARD, 0.0);
        QuantityMeasurement yard2 = null;
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    void given0YardAnd0YardFromDiffRef_ShouldReturnNotSameRef() {
        QuantityMeasurement Yard1 = new QuantityMeasurement(Length.YARD, 0.0);
        QuantityMeasurement Yard2 = new QuantityMeasurement(Length.YARD, 0.0);
        Assertions.assertNotSame(Yard1, Yard2);
    }

    @Test
    void given3FeetAnd1Yard_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 3.0);
        QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1FeetAnd1Yard_WhenCompared_ShouldReturnFalse() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
        QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1InchAnd1Yard_WhenCompared_ShouldReturnFalse() {
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 1.0);
        QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given36InchAnd1Yard_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 36.0);
        QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1YardAnd36Inch_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1YardAnd3Feet_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0CentimeterAnd0Centimeter_ShouldReturnEqual() {
        QuantityMeasurement cm1 = new QuantityMeasurement(Length.CENTI_METER, 0.0);
        QuantityMeasurement cm2 = new QuantityMeasurement(Length.CENTI_METER, 0.0);
        Assertions.assertEquals(cm1, cm2);
    }

    @Test
    void given0CentimeterAnd1Centimeter_ShouldReturnNotEqual() {
        QuantityMeasurement cm1 = new QuantityMeasurement(Length.CENTI_METER, 0.0);
        QuantityMeasurement cm2 = new QuantityMeasurement(Length.CENTI_METER, 1.0);
        Assertions.assertNotEquals(cm1, cm2);
    }

    @Test
    void given2InchAnd5Cm_WhenCompared_ShouldReturnEqualLength() {
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 2.0);
        QuantityMeasurement cm = new QuantityMeasurement(Length.CENTI_METER, 5.0);
        boolean compareCheck = inch.compare(cm);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given5CmAnd2Inch_WhenCompared_ShouldReturnEqualLength() {
        QuantityMeasurement cm = new QuantityMeasurement(Length.CENTI_METER, 5.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 2.0);
        boolean compareCheck = cm.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 2.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Length.INCH, 2.0);
        QuantityMeasurement expectedSum = new QuantityMeasurement(Length.INCH, 4.0);
        QuantityMeasurement actualSum = inch1.sumOfQuantity(inch2, Length.INCH);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 2.0);
        QuantityMeasurement expectedSum = new QuantityMeasurement(Length.INCH, 14.0);
        QuantityMeasurement actualSum = feet.sumOfQuantity(inch, Length.INCH);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET, 1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Length.FEET, 1.0);
        QuantityMeasurement expectedSum = new QuantityMeasurement(Length.INCH, 24.0);
        QuantityMeasurement actualSum = feet1.sumOfQuantity(feet2, Length.INCH);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void given2Inch2$5Cm_WhenAdded_ShouldReturn3Inch() {
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 2.0);
        QuantityMeasurement cm = new QuantityMeasurement(Length.CENTI_METER, 2.5);
        QuantityMeasurement expectedSum = new QuantityMeasurement(Length.INCH, 3.0);
        QuantityMeasurement actualSum = inch.sumOfQuantity(cm, Length.INCH);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void given0GallonAnd0Gallon_ShouldReturnEqualVolume() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 0.0);
        QuantityMeasurement gallon2 = new QuantityMeasurement(Volume.GALLON, 0.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    void given1GallonAnd2Gallon_ShouldReturnNotEqualVolume() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 1.0);
        QuantityMeasurement gallon2 = new QuantityMeasurement(Volume.GALLON, 2.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    void given1GallonAndNull_ShouldReturnNotEqualVolume() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 1.0);
        QuantityMeasurement gallon2 = null;
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    void given1GallonAnd1GallonFromDiffRef_ShouldReturnNotEqualVolume() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 1.0);
        QuantityMeasurement gallon2 = new QuantityMeasurement(Volume.GALLON, 1.0);
        Assertions.assertNotSame(gallon1, gallon2);
    }

    @Test
    void given1GallonAnd1FeetFromDiffType_ShouldReturnNotEqual() {
        QuantityMeasurement volume = new QuantityMeasurement(Volume.GALLON, 1.0);
        QuantityMeasurement length = new QuantityMeasurement(Length.FEET, 1.0);
        Assertions.assertNotEquals(volume, length);
    }

    @Test
    void give0LiterAnd0Liter_ShouldReturnEqualVolume() {
        QuantityMeasurement liter1 = new QuantityMeasurement(Volume.LITER, 0.0);
        QuantityMeasurement liter2 = new QuantityMeasurement(Volume.LITER, 0.0);
        Assertions.assertEquals(liter1, liter2);
    }

    @Test
    void give1LiterAnd2Liter_ShouldReturnNotEqualVolume() {
        QuantityMeasurement liter1 = new QuantityMeasurement(Volume.LITER, 1.0);
        QuantityMeasurement liter2 = new QuantityMeasurement(Volume.LITER, 2.0);
        Assertions.assertNotEquals(liter1, liter2);
    }

    @Test
    void given0GallonAnd0Liter_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 0.0);
        QuantityMeasurement liter = new QuantityMeasurement(Volume.LITER, 0.0);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1GallonAnd1Liter_WhenCompared_ShouldReturnNotEqualVolume() {
        QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 1.0);
        QuantityMeasurement liter = new QuantityMeasurement(Volume.LITER, 1.0);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1GallonAnd3$78Liter_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 1.0);
        QuantityMeasurement liter = new QuantityMeasurement(Volume.LITER, 3.78);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given3$78LiterAnd1Gallon_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurement liter = new QuantityMeasurement(Volume.LITER, 3.78);
        QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 1.0);
        boolean compareCheck = liter.compare(gallon);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1LiterAnd1000MilliLiter_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurement liter = new QuantityMeasurement(Volume.LITER, 1.0);
        QuantityMeasurement ml = new QuantityMeasurement(Volume.MILLI_LITER, 1000.0);
        boolean compareCheck = liter.compare(ml);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1000MilliLiterAnd1Liter_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurement ml = new QuantityMeasurement(Volume.MILLI_LITER, 1000.0);
        QuantityMeasurement liter = new QuantityMeasurement(Volume.LITER, 1.0);
        boolean compareCheck = ml.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1GallonAnd3$78Liter_WhenAdded_ShouldReturn7$57Liter() {
        QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 1.0);
        QuantityMeasurement liter = new QuantityMeasurement(Volume.LITER, 3.78);
        QuantityMeasurement expectedSum = new QuantityMeasurement(Volume.LITER, 7.56);
        QuantityMeasurement actualSum = gallon.sumOfQuantity(liter, Volume.LITER);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void given1LiterAnd1000MilliLiter_WhenAdded_ShouldReturn2Liter() {
        QuantityMeasurement liter = new QuantityMeasurement(Volume.LITER, 1.0);
        QuantityMeasurement ml = new QuantityMeasurement(Volume.MILLI_LITER, 1000.0);
        QuantityMeasurement expectedSum = new QuantityMeasurement(Volume.LITER, 2.0);
        QuantityMeasurement actualSum = liter.sumOfQuantity(ml, Volume.LITER);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void given0GramAnd0Gram_ShouldReturnEqualWeight() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Weight.GRAM, 0.0);
        QuantityMeasurement gram2 = new QuantityMeasurement(Weight.GRAM, 0.0);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    void given0GramAnd1Gram_ShouldReturnNotEqualWeight() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Weight.GRAM, 0.0);
        QuantityMeasurement gram2 = new QuantityMeasurement(Weight.GRAM, 1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    void given0GramAndNull_ShouldReturnNotEqualWeight() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Weight.GRAM, 0.0);
        QuantityMeasurement gram2 = null;
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    void given0GramAnd0GramFromDiffRef_ShouldReturnNotEqualWeight() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Weight.GRAM, 0.0);
        QuantityMeasurement gram2 = new QuantityMeasurement(Weight.GRAM, 0.0);
        Assertions.assertNotSame(gram1, gram2);
    }

    @Test
    void given0GramAnd0GramFromDiffType_ShouldReturnNotEqualWeight() {
        QuantityMeasurement weight = new QuantityMeasurement(Weight.GRAM, 0.0);
        QuantityMeasurement volume = new QuantityMeasurement(Volume.GALLON, 0.0);
        Assertions.assertNotEquals(weight, volume);
    }

    @Test
    void given1KGAnd1000Gram_WhenCompared_ShouldReturnEqualWeight() {
        QuantityMeasurement kg = new QuantityMeasurement(Weight.KILOGRAM, 1.0);
        QuantityMeasurement gram = new QuantityMeasurement(Weight.GRAM, 1000.0);
        boolean compareCheck = kg.compare(gram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1TonneAnd1000KG_WhenCompared_ShouldReturnEqualWeight() {
        QuantityMeasurement tonne = new QuantityMeasurement(Weight.TONNE, 1.0);
        QuantityMeasurement kg = new QuantityMeasurement(Weight.KILOGRAM, 1000.0);
        boolean compareCheck = tonne.compare(kg);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1TonneAnd1000Gram_WhenAdded_ShouldReturn1001KG() {
        QuantityMeasurement tonne = new QuantityMeasurement(Weight.TONNE, 1.0);
        QuantityMeasurement gram = new QuantityMeasurement(Weight.GRAM, 1000.0);
        QuantityMeasurement expectedSum = new QuantityMeasurement(Weight.KILOGRAM, 1001.0);
        QuantityMeasurement actualSum = tonne.sumOfQuantity(gram, Weight.KILOGRAM);
        Assertions.assertEquals(expectedSum, actualSum);
    }
}