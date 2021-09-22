package com.bridgelabz_quantity_measurement;

public class Length {
    public static final double FEET_TO_INCH = 12.0;
    private static final double YARD_TO_FEET = 36.0;
    private static final double INCH_TO_CENTIMETER = 2.54;

    enum Unit{ FEET, INCH, YARD, CENTIMETER };

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

    public boolean compareYardToFeet(Length that) {
        if(this.unit.equals(that.unit))
            return this.equals(that);
        if(this.unit.equals(Unit.YARD) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value*YARD_TO_FEET, that.value) == 0;
        return false;
    }

    public boolean compareInchToCentimeter(Length that) {
        if(this.unit.equals(that.unit))
            return this.equals(that);
        if(this.unit.equals(Unit.INCH) && that.unit.equals(Unit.CENTIMETER))
            return Double.compare(this.value*INCH_TO_CENTIMETER, that.value) == 0;
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
