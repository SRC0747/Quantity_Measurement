package com.bridgelabz_quantity_measurement;

public class Volume {

    private static final double GALLON_TO_LITRE = 3.78;

    enum Unit{ KG, GRAM, TONNE, LITRE, ML, GALLON  };

    private final Unit unit;
    private final double value;

    public Volume(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Volume that) {
        if(this.unit.equals(that.unit))
            return this.equals(that);
        if(this.unit.equals(Volume.Unit.GALLON) && that.unit.equals(Volume.Unit.LITRE))
            return Double.compare(this.value*GALLON_TO_LITRE, that.value) == 0;
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Volume volume = (Volume) obj;
        //if(this.unit.equals(((Length) obj).unit))
        return Double.compare(volume.value,value) == 0 && unit == volume.unit;
    }
}
