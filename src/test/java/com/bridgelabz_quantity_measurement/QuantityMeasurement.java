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
    public boolean LitreConversion(double gallon, double litre){
        double result = gallon*3.78;
        if(result == litre){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean MlConversion(double litre, double ml){
        double result = litre*1000;
        if(result == litre){
            return true;
        }
        else{
            return false;
        }
    }
}