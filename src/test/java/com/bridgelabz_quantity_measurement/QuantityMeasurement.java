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
        double result = yard*3;
        if(result == feet){
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
        double result1 = inch*2.54;
        if(result1 == centimeter){
            return true;
        }
        else{
            return false;
        }
    }
}