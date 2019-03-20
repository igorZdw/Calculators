package com.academy.PromilCalculator.controllers;

import com.academy.PromilCalculator.models.CalculatorFromBmi;

import com.academy.PromilCalculator.models.CalculatorFromBmr;
import com.academy.PromilCalculator.services.CalculatorBmr;
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
public class CalculatorBmrController {
    @Autowired
    CalculatorBmr calculatorBmr;


    @RequestMapping("/bmr")
    public String createOperationModel(Model model) {
        model.addAttribute("bmrFormData", new CalculatorFromBmr());
        return "bmrform";
    }

    @RequestMapping(path="/bmr", method = RequestMethod.POST)
    public String add(@Valid @ModelAttribute("bmrFormData") CalculatorFromBmr calculatorFromBmr, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "bmrform";
        }

        double result = calculatorBmr.calculate(calculatorFromBmr.getHeight(), calculatorFromBmr.getBodyweight(), calculatorFromBmr.getAge());
        redirectAttributes.addFlashAttribute("result", result);
        return "redirect:/bmr";
    }
}
