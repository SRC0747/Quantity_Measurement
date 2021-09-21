package com.bridgelabz_quantity_measurement;

public class QuantityMeasurement {
    public boolean InchConversion(double feet, double inch){
        double result = feet*12;
        if(result == inch){
            return true;
        }
        else{
            return false;
        }
    }
}