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
    public boolean YardConversion(double feet, double yard){
        double result = feet*3;
        if(result == yard){
            return true;
        }
        else{
            return false;
        }
    }
}