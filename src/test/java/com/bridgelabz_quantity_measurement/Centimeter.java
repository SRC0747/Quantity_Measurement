package com.bridgelabz_quantity_measurement;

public class Centimeter {
    private final double value;

    public Centimeter(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Centimeter centimeter = (Centimeter) obj;
        return Double.compare(centimeter.value,value) == 0;
    }
}
