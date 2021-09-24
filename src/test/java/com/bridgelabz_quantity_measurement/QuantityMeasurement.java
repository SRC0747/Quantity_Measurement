package com.bridgelabz_quantity_measurement;

public class QuantityMeasurement {
    public boolean inchConversion(double feet, double inch){
        double result = feet*12;
        if(result == inch)
            return true;
        return false;
    }
    public boolean yardConversion(double feet, double yard){
        double result = yard*3;
        if(result == feet)
            return true;
       return false;
    }
    public boolean yardToInchConversion(double yard, double inch){
        double result = yard*36;
        if(result == inch)
            return true;
        return false;
    }
    public boolean inchToCentimeterConversion(double inch, double centimeter){
        double result1 = inch*2.54;
        if(result1 == centimeter)
            return true;
        return false;
        }
    public boolean litreConversion(double gallon, double litre){
        double result = gallon*3.78;
        if(result == litre)
            return true;
        return false;
    }
    public boolean mlConversion(double litre, double ml){
        double result = litre*1000;
        if(result == litre)
            return true;
       return false;
    }
    public boolean gramConversion(double kg, double gram){
        double result = kg*1000;
        if(result == gram)
            return true;
       return false;
    }
    public boolean tonToKillogramConversion(double ton, double kg){
        double result = ton*1000;
        if(result == kg)
            return true;
       return false;
    }
    public boolean centigradeToFahrenheitConversion(double centigrade, double fahrenheit){
        double result = centigrade*2.12;
        if(result == fahrenheit)
            return true;
        return false;
    }
}