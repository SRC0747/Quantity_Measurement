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
    public void given0FeetAndNullValue_ShouldReturnNotEqual() {
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
        boolean result = quantityMeasurement.inchConversion(1.0, 12);
        Assertions.assertTrue(result);
    }

    @Test
    public void given0YardAnd0Yard_ShouldReturnEqual() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        Length yard2 = new Length(Length.Unit.YARD, 0.0);
        Assertions.assertEquals(yard1, yard2);
    }

    @Test
    public void given0YardAnd1Yard_ShouldReturnNotEqual() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        Length yard2 = new Length(Length.Unit.YARD, 1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given0YardAnd1YardNullValue_ShouldReturnNotEqual() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        Length yard2 = null;
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void givenReferenceCheckForYard_ShouldReturnEqual() {
        Length yard1 = new Length(Length.Unit.YARD, 2.0);
        Assertions.assertTrue(yard1.equals(yard1));
    }

    @Test
    public void givenTypeCheckForYard_ShouldReturnEquals() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        Length yard2 = new Length(Length.Unit.YARD, 0.0);
        Assertions.assertTrue(yard1.getClass().equals(yard2.getClass()));
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean result = quantityMeasurement.yardConversion(3.0, 1.0);
        Assertions.assertTrue(result);
    }

    @Test
    public void given1YardAnd36Inch_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean result = quantityMeasurement.yardToInchConversion(1.0, 36.0);
        Assertions.assertTrue(result);
    }

    @Test
    public void given0CentimeterAnd0Centimeter_ShouldReturnEqual() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 0.0);
        Length centimeter2 = new Length(Length.Unit.CENTIMETER, 0.0);
        Assertions.assertEquals(centimeter1, centimeter2);
    }

    @Test
    public void given0CentimeterAnd1Centimeter_ShouldReturnNotEqual() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 0.0);
        Length centimeter2 = new Length(Length.Unit.CENTIMETER, 1.0);
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void given0CentimeterAnd1CentimeterNullValue_ShouldReturnNotEqual() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 0.0);
        Length centimeter2 = null;
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void givenReferenceCheckForCentimeter_ShouldReturnEqual() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 2.0);
        Assertions.assertTrue(centimeter1.equals(centimeter1));
    }

    @Test
    public void givenTypeCheckForCentimeter_ShouldReturnEquals() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 0.0);
        Length centimeter2 = new Length(Length.Unit.CENTIMETER, 0.0);
        Assertions.assertTrue(centimeter1.getClass().equals(centimeter2.getClass()));
    }

    @Test
    public void given2InchAnd5Centimeter_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean result = quantityMeasurement.inchToCentimeterConversion(1.0, 2.54);
        Assertions.assertTrue(result);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0YardAnd0Feet_ShouldReturnEqualLength() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        boolean compareCheck = yard1.compareYardToFeet(feet1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd1Feet_ShouldReturnNotEqualLength() {
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = yard1.compareYardToFeet(feet1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        Length yard2 = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = yard1.compareYardToFeet(yard2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0InchAnd0Centimeter_ShouldReturnEqualLength() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 0.0);
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        boolean compareCheck = inch1.compareInchToCentimeter(centimeter1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Centimeter_ShouldReturnNotEqualLength() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        boolean compareCheck = inch1.compareInchToCentimeter(centimeter1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Inch_WhenCompared_ShouldReturnEqualLength() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 1.0);
        Length centimeter2 = new Length(Length.Unit.CENTIMETER, 1.0);
        boolean compareCheck = centimeter1.compareInchToCentimeter(centimeter2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void givenAdditionOf2InchAnd2Inch_ShouldReturn4Inch() {
        Length inch1 = new Length(Length.Unit.INCH, 2.0);
        Length inch2 = new Length(Length.Unit.INCH, 2.0);
        inch1.sumOfLength(inch2);
    }

    @Test
    public void givenAdditionOf1FeetAnd2Inch_ShouldReturn14Inch() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 2.0);
        feet1.sumOfLength(inch1);
    }

    @Test
    public void givenAdditionOf1FeetAnd1Feet_ShouldReturn24Inch() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        feet1.sumOfLength(feet2);
    }

    @Test
    public void givenAdditionOf2InchAnd3Centimeter_ShouldReturn3Inch() {
        Length inch1 = new Length(Length.Unit.INCH, 2.0);
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 2.5);
        inch1.sumOfLength(centimeter1);
    }

    @Test
    public void given0GallonAnd0Gallon_ShouldReturnEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 0.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    public void given0GallonAnd1Gallon_ShouldReturnNotEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given0GallonAndNullValue_ShouldReturnNotEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume gallon2 = null;
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void givenReferenceCheckForGallon_ShouldReturnEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 2.0);
        Assertions.assertTrue(gallon1.equals(gallon1));
    }

    @Test
    public void givenTypeCheckForGallon_ShouldReturnEquals() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 0.0);
        Assertions.assertTrue(gallon1.getClass().equals(gallon2.getClass()));
    }

    @Test
    public void given0LitreAnd0Litre_ShouldReturnEqual() {
        Volume litre1 = new Volume(Volume.Unit.LITRE, 0.0);
        Volume litre2 = new Volume(Volume.Unit.LITRE, 0.0);
        Assertions.assertEquals(litre1, litre2);
    }

    @Test
    public void given0LitreAnd1Litre_ShouldReturnNotEqual() {
        Volume litre1 = new Volume(Volume.Unit.LITRE, 0.0);
        Volume litre2 = new Volume(Volume.Unit.LITRE, 1.0);
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    public void given0LitreAndNullValue_ShouldReturnNotEqual(){
        Volume litre1 = new Volume(Volume.Unit.LITRE, 0.0);
        Volume litre2 = null;
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    public void givenReferenceCheckForLitre_ShouldReturnEqual() {
        Volume litre1 = new Volume(Volume.Unit.LITRE, 2.0);
        Assertions.assertTrue(litre1.equals(litre1));
    }

    @Test
    public void givenTypeCheckForLitre_ShouldReturnEquals() {
        Volume litre1 = new Volume(Volume.Unit.LITRE, 0.0);
        Volume litre2 = new Volume(Volume.Unit.LITRE, 0.0);
        Assertions.assertTrue(litre1.getClass().equals(litre2.getClass()));
    }

    @Test
    public void given0GallonAnd0Litre_ShouldReturnEqualLength() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume litre1 = new Volume(Volume.Unit.LITRE, 0.0);
        boolean compareCheck = gallon1.compare(litre1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd1Litre_ShouldReturnNotEqualLength() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 1.0);
        Volume litre1 = new Volume(Volume.Unit.LITRE, 1.0);
        boolean compareCheck = gallon1.compare(litre1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1GallonAnd1Gallon_ShouldReturnNotEqualLength() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 1.0);
        Volume gallon2 = new Volume(Volume.Unit.LITRE, 1.0);
        boolean compareCheck = gallon1.compare(gallon2);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1GallonAnd4Litre_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean result = quantityMeasurement.litreConversion(1.0, 3.78);
        Assertions.assertTrue(result);
    }

    @Test
    public void given0MlAnd0Ml_ShouldReturnEqual() {
        Volume ml1 = new Volume(Volume.Unit.ML, 0.0);
        Volume ml2 = new Volume(Volume.Unit.ML, 0.0);
        Assertions.assertEquals(ml1, ml2);
    }

    @Test
    public void given0MlAnd1Ml_ShouldReturnNotEqual() {
        Volume ml1 = new Volume(Volume.Unit.ML, 0.0);
        Volume ml2 = new Volume(Volume.Unit.ML, 1.0);
        Assertions.assertNotEquals(ml1, ml2);
    }

    @Test
    public void given0MlAndNullValue_ShouldReturnNotEqual() {
        Volume ml1 = new Volume(Volume.Unit.ML, 0.0);
        Volume ml2 = null;
        Assertions.assertNotEquals(ml1, ml2);
    }

    @Test
    public void givenReferenceCheckForMl_ShouldReturnEqual() {
        Volume ml1 = new Volume(Volume.Unit.ML, 2.0);
        Assertions.assertTrue(ml1.equals(ml1));
    }

    @Test
    public void givenTypeCheckForMl_ShouldReturnEquals() {
        Volume ml1 = new Volume(Volume.Unit.ML, 0.0);
        Volume ml2 = new Volume(Volume.Unit.ML, 0.0);
        Assertions.assertTrue(ml1.getClass().equals(ml2.getClass()));
    }


    @Test
    public void givenAdditionOf1GallonAnd4Litre_ShouldReturn8Litre() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 1.0);
        Volume litre1 = new Volume(Volume.Unit.LITRE, 3.78);
        gallon1.sumOfVolume(litre1);
    }

    @Test
    public void givenAdditionOf1000MlAnd1Litre_ShouldReturn2Litre() {
        Volume ml1 = new Volume(Volume.Unit.ML, 1000.0);
        Volume litre1 = new Volume(Volume.Unit.LITRE, 1.0);
        ml1.sumOfVolume(litre1);
    }

    @Test
    public void given0KgAnd0Kg_ShouldReturnEqual() {
        Weight kg1 = new Weight(Weight.Unit.KG, 0.0);
        Weight kg2 = new Weight(Weight.Unit.KG, 0.0);
        Assertions.assertEquals(kg1, kg2);
    }

    @Test
    public void given0KgAnd1Kg_ShouldReturnNotEqual() {
        Weight kg1 = new Weight(Weight.Unit.KG, 0.0);
        Weight kg2 = new Weight(Weight.Unit.KG, 1.0);
        Assertions.assertNotEquals(kg1, kg2);
    }

    @Test
    public void given0KgAndNullValue_ShouldReturnNotEqual() {
        Weight kg1 = new Weight(Weight.Unit.KG, 0.0);
        Weight kg2 = null;
        Assertions.assertNotEquals(kg1, kg2);
    }

    @Test
    public void givenReferenceCheckForKg_ShouldReturnEqual() {
        Weight kg1 = new Weight(Weight.Unit.KG, 2.0);
        Assertions.assertTrue(kg1.equals(kg1));
    }

    @Test
    public void givenTypeCheckForKg_ShouldReturnEquals() {
        Weight kg1 = new Weight(Weight.Unit.KG, 0.0);
        Weight kg2 = new Weight(Weight.Unit.KG, 0.0);
        Assertions.assertTrue(kg1.getClass().equals(kg2.getClass()));
    }

    @Test
    public void given0GramAnd0Gram_ShouldReturnEquals() {
        Weight gm1 = new Weight(Weight.Unit.GRAM, 0.0);
        Weight gm2 = new Weight(Weight.Unit.GRAM, 0.0);
        Assertions.assertEquals(gm1, gm2);
    }

    @Test
    public void given0GramAnd1Gram_ShouldReturnNotEquals() {
        Weight gm1 = new Weight(Weight.Unit.GRAM, 0.0);
        Weight gm2 = new Weight(Weight.Unit.GRAM, 1.0);
        Assertions.assertNotEquals(gm1, gm2);
    }

    @Test
    public void given0GramAndNullValue_ShouldReturnNotEquals() {
        Weight gm1 = new Weight(Weight.Unit.GRAM, 0.0);
        Volume gm2 = null;
        Assertions.assertNotEquals(gm1, gm2);
    }

    @Test
    public void givenReferenceCheckForGram_ShouldReturnEquals() {
        Weight gram1 = new Weight(Weight.Unit.GRAM, 2.0);
        Assertions.assertTrue(gram1.equals(gram1));
    }

    @Test
    public void givenTypeCheckForGram_ShouldReturnEquals() {
        Weight gm1 = new Weight(Weight.Unit.GRAM, 0.0);
        Weight gm2 = new Weight(Weight.Unit.GRAM, 0.0);
        Assertions.assertTrue(gm1.getClass().equals(gm2.getClass()));
    }

    @Test
    public void given0TonAnd0Ton_ShouldReturnEquals() {
        Weight ton1 = new Weight(Weight.Unit.TONNE, 0.0);
        Weight ton2 = new Weight(Weight.Unit.TONNE, 0.0);
        Assertions.assertEquals(ton1, ton2);
    }

    @Test
    public void given0TonAnd1Ton_ShouldReturnNotEquals() {
        Weight ton1 = new Weight(Weight.Unit.TONNE, 0.0);
        Weight ton2 = new Weight(Weight.Unit.TONNE, 1.0);
        Assertions.assertNotEquals(ton1, ton2);
    }

    @Test
    public void given0TonAndNullValue_ShouldReturnNotEquals() {
        Weight ton1 = new Weight(Weight.Unit.TONNE, 0.0);
        Weight ton2 = null;
        Assertions.assertNotEquals(ton1, ton2);
    }

    @Test
    public void givenReferenceCheckForTon_ShouldReturnEquals() {
        Weight ton1 = new Weight(Weight.Unit.TONNE, 2.0);
        Assertions.assertTrue(ton1.equals(ton1));
    }

    @Test
    public void givenTypeCheckForTon_ShouldReturnEquals() {
        Weight ton1 = new Weight(Weight.Unit.TONNE, 0.0);
        Weight ton2 = new Weight(Weight.Unit.TONNE, 0.0);
        Assertions.assertTrue(ton1.getClass().equals(ton2.getClass()));
    }

    @Test
    public void given1KgAnd1000Gram_ShouldReturnEquals() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean result = quantityMeasurement.gramConversion(1.0, 1000.0);
        Assertions.assertTrue(result);
    }

    @Test
    public void given1TonAnd1000Kg_ShouldReturnEquals() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean result = quantityMeasurement.tonToKillogramConversion(1.0, 1000.0);
        Assertions.assertTrue(result);
    }

    @Test
    public void given1TonAnd1000Gram_ShouldReturn1001Kg() {
        Weight ton1 = new Weight(Weight.Unit.TONNE, 1.0);
        Weight gm1 = new Weight(Weight.Unit.TONNE, 1000.0);
        ton1.sumOfWeight(gm1);
    }

    @Test
    public void given0CentigradeAnd0Centigrade_ShouldReturnEquals() {
        Temparature centigrade1 = new Temparature(Temparature.Unit.CENTIGRADE, 0.0);
        Temparature centigrade2 = new Temparature(Temparature.Unit.CENTIGRADE, 0.0);
        Assertions.assertEquals(centigrade1, centigrade2);
    }

    @Test
    public void given0CentigradeAnd1Centigrade_ShouldReturnNotEquals() {
        Temparature centigrade1 = new Temparature(Temparature.Unit.CENTIGRADE, 0.0);
        Temparature centigrade2 = new Temparature(Temparature.Unit.CENTIGRADE, 1.0);
        Assertions.assertNotEquals(centigrade1, centigrade2);
    }

    @Test
    public void given0CentigradeAndNullValue_ShouldReturnNotEquals() {
        Temparature centigrade1 = new Temparature(Temparature.Unit.CENTIGRADE, 0.0);
        Temparature centigrade2 = null;
        Assertions.assertNotEquals(centigrade1, centigrade2);
    }

    @Test
    public void givenReferenceCheckForCentigrade_ShouldReturnEquals() {
        Temparature temparature1 = new Temparature(Temparature.Unit.CENTIGRADE, 2.0);
        Assertions.assertTrue(temparature1.equals(temparature1));
    }

    @Test
    public void givenTypeCheckForCentigrade_ShouldReturnEquals() {
        Temparature centigrade1 = new Temparature(Temparature.Unit.CENTIGRADE, 0.0);
        Temparature centigrade2 = new Temparature(Temparature.Unit.CENTIGRADE, 0.0);
        Assertions.assertTrue(centigrade1.getClass().equals(centigrade2.getClass()));
    }

    @Test
    public void given0FahrenheitAnd0Fahrenheit_ShouldReturnEquals() {
        Temparature fahrenheit1 = new Temparature(Temparature.Unit.FAHRENHEIT, 0.0);
        Temparature fahrenheit2 = new Temparature(Temparature.Unit.FAHRENHEIT, 0.0);
        Assertions.assertEquals(fahrenheit1, fahrenheit2);
    }

    @Test
    public void given0FahrenheitAnd1Fahrenheit_ShouldReturnNotEquals() {
        Temparature fahrenheit1 = new Temparature(Temparature.Unit.FAHRENHEIT, 0.0);
        Temparature fahrenheit2 = new Temparature(Temparature.Unit.FAHRENHEIT, 1.0);
        Assertions.assertNotEquals(fahrenheit1, fahrenheit2);
    }

    @Test
    public void given0FahrenheitAndNullValue_ShouldReturnNotEquals() {
        Temparature fahrenheit1 = new Temparature(Temparature.Unit.FAHRENHEIT, 0.0);
        Temparature fahrenheit2 = null;
        Assertions.assertNotEquals(fahrenheit1, fahrenheit2);
    }

    @Test
    public void givenReferenceCheckForFahrenheit_ShouldReturnEquals() {
        Temparature fahrenheit1 = new Temparature(Temparature.Unit.FAHRENHEIT, 2.0);
        Assertions.assertTrue(fahrenheit1.equals(fahrenheit1));
    }

    @Test
    public void givenTypeCheckForFahrenheit_ShouldReturnEquals() {
        Temparature fahrenheit1 = new Temparature(Temparature.Unit.FAHRENHEIT, 0.0);
        Temparature fahrenheit2 = new Temparature(Temparature.Unit.FAHRENHEIT, 0.0);
        Assertions.assertTrue(fahrenheit1.getClass().equals(fahrenheit2.getClass()));
    }

    @Test
    public void given100CentigradeAnd212Fahrenheit_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean result = quantityMeasurement.centigradeToFahrenheitConversion(1.0, 2.12);
        Assertions.assertTrue(result);
    }
}