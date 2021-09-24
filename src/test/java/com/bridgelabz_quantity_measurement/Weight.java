package com.bridgelabz_quantity_measurement;

public enum Weight implements MeasurementUnits {
    GRAM(0.001), KILOGRAM(1), TONNE(1000);

    private final double baseUnitConversion;

    Weight(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    @Override
    public double convertToBaseUnit(QuantityMeasurement obj) {
        return obj.value * baseUnitConversion;
    }}