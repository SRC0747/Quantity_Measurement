package com.bridgelabz_quantity_measurement;

public class Length {
    enum Unit{ FEET, INCH};

    private final Unit unit;
    private final double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Length length = (Length) obj;
        //if(this.unit.equals(((Length) obj).unit))
        return Double.compare(length.value,value) == 0 && unit == length.unit;
    }
}
