package com.academy.PromilCalculator.controllers;

import com.academy.PromilCalculator.models.CalculatorFromData;
import com.academy.PromilCalculator.services.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class CalculatorController {
@Autowired
Calculator calculator;

    @RequestMapping("/breathalyser")
    public String createOperationModel(Model model) {
        model.addAttribute("operationModel", new CalculatorFromData());
        return "calculatorform";
    }

    @RequestMapping(path="/breathalyser", method = RequestMethod.POST)
    public String add(@Valid @ModelAttribute("operationModel")CalculatorFromData calculatorFromData, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "calculatorform";
        }

        double result =  calculator.calculate(calculatorFromData.getAlcoholInGrams(), calculatorFromData.getCoeffieicient(), calculatorFromData.getBodyweight());

        redirectAttributes.addFlashAttribute("result", result);
        return "redirect:/breathalyser";


    }


}
