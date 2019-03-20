package com.academy.PromilCalculator.services;


import org.springframework.stereotype.Component;

@Component
public class CalculatorBmr {

    public double calculate(double height, double bodyweight,int age){
return 66+(13.7*bodyweight)+(5*height)-(6.76*age);
    }

}
