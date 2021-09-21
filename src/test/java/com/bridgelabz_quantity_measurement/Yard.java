package com.bridgelabz_quantity_measurement;

public class Yard {
    private final double value;

    public Yard(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Yard yard = (Yard) obj;
        return Double.compare(yard.value,value) == 0;
    }
}
