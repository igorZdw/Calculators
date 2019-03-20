package com.academy.PromilCalculator.services;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

public double calculate(double alcoholInGrams,double coeffieicient, double bodyweight){
    return alcoholInGrams/bodyweight*coeffieicient;
}


}
