package com.bridgelabz_quantity_measurement;

public class QuantityMeasurement {
    public double value;
    public MeasurementUnits unit;

    public QuantityMeasurement(MeasurementUnits unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(QuantityMeasurement that) {
        if (this.unit.equals(that.unit))
            return this.equals(that);
        return Double.compare(this.unit.convertToBaseUnit(this), that.unit.convertToBaseUnit(that)) == 0;
    }

    public QuantityMeasurement sumOfQuantity(QuantityMeasurement that, MeasurementUnits requiredUnit) {
        double sumOfInput = this.unit.convertToBaseUnit(this) + that.unit.convertToBaseUnit(that);
        return new QuantityMeasurement(requiredUnit, sumOfInput);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        QuantityMeasurement length = (QuantityMeasurement) that;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}