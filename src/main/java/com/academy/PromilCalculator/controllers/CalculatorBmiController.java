package com.academy.PromilCalculator.controllers;

import com.academy.PromilCalculator.models.CalculatorFromBmi;
import com.academy.PromilCalculator.services.CalculatorBmi;
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
public class CalculatorBmiController {
  @Autowired
    CalculatorBmi calculatorBmi;
    @RequestMapping("/bmi")
    public String createOperationModel(Model model) {
        model.addAttribute("operationModel", new CalculatorFromBmi());
        return "bmiform";
    }

    @RequestMapping(path="/bmi", method = RequestMethod.POST)
    public String add(@Valid @ModelAttribute("operationModel") CalculatorFromBmi calculatorFromBmi, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "bmiform";
        }
        double result = calculatorBmi.calculate(calculatorFromBmi.getHeight(),calculatorFromBmi.getBodyweight());
        redirectAttributes.addFlashAttribute("result", result);
        return "redirect:/bmi";

    }

}
