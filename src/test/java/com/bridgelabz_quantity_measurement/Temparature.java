package com.bridgelabz_quantity_measurement;

public class Temparature {

    enum Unit{ CENTIGRADE, FAHRENHEIT };

    private final Unit unit;
    private final double value;

    public Temparature(Unit unit, double value){
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Temparature temparature = (Temparature) obj;
        //if(this.unit.equals(((Length) obj).unit))
        return Double.compare(temparature.value,value) == 0 && unit == temparature.unit;
    }
}
