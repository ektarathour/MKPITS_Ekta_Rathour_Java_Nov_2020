//Example of calculate simple interest
package com.mkpits.java.encapsulationPrograms;

public class ExOfCalculateSimpleInterest {
    private float roi;
    public void SetRateOfInterest(float roi) {
        this.roi = roi;
    }
    public float calinterest(float pa,int nom){
        float pi=pa*roi*nom;
        return pi;
    }
}
