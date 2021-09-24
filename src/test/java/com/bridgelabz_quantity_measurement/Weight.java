package com.bridgelabz_quantity_measurement;

public class Weight {

    private static final double TONNE_TO_KILO_GRAM = 1000.0;
    private static final double KILO_GRAM_TO_GRAM = 1000.0;

    enum Unit{ KG, GRAM, TONNE };

    private final Unit unit;
    private final double value;

    public Weight(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public Weight sumOfWeight(Weight that) {
        double sumOfWeight = 0.0;
        if (this.unit.equals(Weight.Unit.TONNE) && that.unit.equals(Weight.Unit.GRAM))
            sumOfWeight = this.value * TONNE_TO_KILO_GRAM + that.value / KILO_GRAM_TO_GRAM;
        return new Weight(Weight.Unit.KG, sumOfWeight);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Weight weight = (Weight) obj;
        //if(this.unit.equals(((Length) obj).unit))
        return Double.compare(weight.value,value) == 0 && unit == weight.unit;
    }
}
