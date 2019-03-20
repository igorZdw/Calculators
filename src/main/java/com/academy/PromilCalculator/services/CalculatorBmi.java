package com.academy.PromilCalculator.services;

import org.springframework.stereotype.Component;

@Component
public class CalculatorBmi {

public double calculate(double height, double bodyweight){
    return bodyweight/(height*height);
}
}
