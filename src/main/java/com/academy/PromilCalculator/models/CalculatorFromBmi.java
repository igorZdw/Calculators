package com.academy.PromilCalculator.models;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

public class CalculatorFromBmi {
    @NotNull(message = "Pole nie może być puste")
    @Range(min=20,max=300,message = "Masa ciała musi wynosić od 20 do 300kg")
    private double bodyweight;
    @NotNull(message = "Pole nie może być puste")
    private double height;

    public CalculatorFromBmi(double bodyweight, double height) {
        this.bodyweight = bodyweight;
        this.height = height;
    }
 public CalculatorFromBmi(){}

    public double getBodyweight() {
        return bodyweight;
    }

    public void setBodyweight(double bodyweight) {
        this.bodyweight = bodyweight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
