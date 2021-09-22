package com.bridgelabz_quantity_measurement;

public class Length {
    private static final double FEET_TO_INCH = 12.0;

    enum Unit{ FEET, INCH};

    private final Unit unit;
    private final double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length that) {
        if(this.unit.equals(that.unit))
            return this.equals(that);
        if(this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value*FEET_TO_INCH, that.value) == 0;
        return false;
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
