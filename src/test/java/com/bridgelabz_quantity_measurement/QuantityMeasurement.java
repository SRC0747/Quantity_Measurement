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
    public boolean YardToInchConversion(double yard, double inch){
        double result = yard*36;
        if(result == inch){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean InchToCentimeterConversion(double inch, double centimeter){
        double result1 = inch*2;
        double result2 = centimeter*5;
        if(result1 == result2){
            return true;
        }
        else{
            return false;
        }
    }
}