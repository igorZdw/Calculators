package com.academy.PromilCalculator.models;

import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CalculatorFromData {
    @NotNull
    private double coeffieicient;
    @NotNull
    @Range(min=20,max=300,message = "Waga musi wynosić od 20 do 300kg")
    private double bodyweight;
    @NotNull
    @Range(min=20,max=800,message = "Ilość gramów  musi wynosić od 20 do 800g")
    private double alcoholInGrams;


    public CalculatorFromData(double coeffieicient, double bodyweight, double alcoholInGrams) {
        this.coeffieicient = coeffieicient;
        this.bodyweight = bodyweight;
        this.alcoholInGrams = alcoholInGrams;
    }

    public CalculatorFromData(){}

    public double getCoeffieicient() {
        return coeffieicient;
    }

    public void setCoeffieicient(double coeffieicient) {
        this.coeffieicient = coeffieicient;
    }

    public double getBodyweight() {
        return bodyweight;
    }

    public void setBodyweight(double bodyweight) {
        this.bodyweight = bodyweight;
    }

    public double getAlcoholInGrams() {
        return alcoholInGrams;
    }

    public void setAlcoholInGrams(double alcoholInGrams) {
        this.alcoholInGrams = alcoholInGrams;
    }


}
