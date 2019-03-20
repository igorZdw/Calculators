package com.academy.PromilCalculator.models;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


public class CalculatorFromBmr {
    @NotNull(message = "Pole nie może być puste")
    @Range(min= 100,max = 220, message = "Wzrost musi być od 100 do 220cm")
    private double height;
    @NotNull(message = "Pole nie może być puste")
    @Range(min=20,max=300,message = "Masa ciała musi wynosić id 29 do 300kg")
    private double bodyweight;
    @Range(min = 10,max =100, message = "Wiek musi być pomiędzy 10 a 100 lat")
    @NotNull(message = "Pole nie może być puste pole")
    private int age;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBodyweight() {
        return bodyweight;
    }

    public void setBodyweight(double bodyweight) {
        this.bodyweight = bodyweight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CalculatorFromBmr(double height, double bodyweight, int age) {
        this.height = height;
        this.bodyweight = bodyweight;
        this.age = age;
    }

    public CalculatorFromBmr() {
    }


}