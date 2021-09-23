package com.bridgelabz_quantity_measurement;

public class Volume {

    enum Unit{ KG, GRAM, TONNE, LITRE, ML, GALLON  };

    private final Unit unit;
    private final double value;

    public Volume(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
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
